package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069862 Smallest k such that n divides the concatenation of numbers from (n+1) to (n+k), where (n+1) is on the most significant side.
 * @author Sean A. Irvine
 */
public class A069862 extends Sequence1 {

  private long mM = 10;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    long k = mN + 1;
    Z t = Z.valueOf(k);
    long m = k == mM ? mM * 10 : mM;
    while (t.mod(mN) != 0) {
      if (++k == m) {
        m *= 10;
      }
      t = t.multiply(m).add(k);
    }
    return Z.valueOf(k - mN);
  }
}

