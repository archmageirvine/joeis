package irvine.oeis.a328;

import irvine.math.group.TridiagonalSingerCycle;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A328643 Positive integers m such that the matrix E_m has order 3^m-1 in GL_m(3) where E_m is the m X m invertible tridiagonal matrix with all nonzero entries equal to 1 except for the (m,m) entry that is equal to 2.
 * @author Gregory Morse
 */
public class A328643 extends Sequence1 {

  private int mM = 0;

  @Override
  public Z next() {
    while (!TridiagonalSingerCycle.hasFullOrder(3, ++mM)) {
      // Do nothing.
    }
    return Z.valueOf(mM);
  }
}
