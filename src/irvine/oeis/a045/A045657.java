package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000984;

/**
 * A045657 Number of 2n-bead balanced binary strings, rotationally inequivalent to reverse, complement and reversed complement.
 * @author Sean A. Irvine
 */
public class A045657 extends A000984 {

  private final Sequence mA = new A045653();
  private final Sequence mB = new A045654();
  private final Sequence mC = new A045655();
  private final Sequence mD = new A045656();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).subtract(mB.next()).subtract(mC.next()).add(mD.next().multiply2());
  }
}
