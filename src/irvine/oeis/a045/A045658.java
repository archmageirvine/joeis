package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045658 Number of 2n-bead balanced binary strings, rotationally equivalent to reverse, inequivalent to complement and reversed complement.
 * @author Sean A. Irvine
 */
public class A045658 extends A045653 {

  private final Sequence mA = new A045656();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
