package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045660 Number of 2n-bead balanced binary strings, rotationally equivalent to reversed complement, inequivalent to reverse and complement.
 * @author Sean A. Irvine
 */
public class A045660 extends A045655 {

  private final Sequence mA = new A045656();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
