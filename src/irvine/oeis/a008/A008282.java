package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008282 Triangle of Euler-Bernoulli or Entringer numbers read by rows: <code>T(n,k)</code> is the number of down-up permutations of <code>n+1</code> starting with <code>k+1</code>.
 * @author Sean A. Irvine
 */
public class A008282 extends A008281 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}

