package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045659 Number of 2n-bead balanced binary strings, rotationally equivalent to complement, inequivalent to reverse and reversed complement.
 * @author Sean A. Irvine
 */
public class A045659 extends A045654 {

  private final Sequence mA = new A045656();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
