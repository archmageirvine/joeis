package irvine.oeis.a328;

import irvine.math.group.TridiagonalSingerCycle;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A328642 Positive integers m such that the matrix E_m has order 2^m-1 in GL_m(2) where E_m is the m X m invertible tridiagonal matrix with all nonzero entries equal to 1 except for the (m,m) entry that is equal to 2.
 * @author Gregory Morse
 */
public class A328642 extends Sequence1 {

  private int mM = 0;

  @Override
  public Z next() {
    while (!TridiagonalSingerCycle.hasFullOrder(2, ++mM)) {
      // Do nothing.
    }
    return Z.valueOf(mM);
  }
}
