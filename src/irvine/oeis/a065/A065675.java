package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065675 The exponent of 2 in the fractions of the range ]0,1[ Stern-Brocot tree (A007305/A007306) [1/2, 1/3, 2/3, 1/4, 2/5, 3/5, 3/4, 1/5, 2/7, 3/8, 3/7, 4/7, 5/8, 5/7, 4/5, ...].
 * @author Sean A. Irvine
 */
public class A065675 extends A065658 {

  private long mN = 0;

  private long expOf2(final Q t) {
    return t.num().makeOdd().auxiliary() - t.den().makeOdd().auxiliary();
  }

  @Override
  public Z next() {
    return Z.valueOf(expOf2(sternBrocot01Frac(++mN)));
  }
}
