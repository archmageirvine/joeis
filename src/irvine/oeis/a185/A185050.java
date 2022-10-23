package irvine.oeis.a185;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A185050 Least k such that G(k) &gt; 3 - 1/2^n, where G(k) is the sum of the first k terms of the geometric series 1 + 2/3 + (2/3)^2 + ....
 * @author Georg Fischer
 */
public class A185050 extends Sequence0 {

  private int mK = 1;
  private int mN = -1;
  private final Q mQ23 = new Q(2, 3);
  private Q mPow23 = Q.ONE;
  private Q mSum = Q.ONE;

  @Override
  public Z next() {
    ++mN;
    final Q limit = Q.THREE.subtract(new Q(Z.ONE, Z.ONE.shiftLeft(mN)));
    while (mSum.compareTo(limit) <= 0) {
      ++mK;
      mPow23 = mPow23.multiply(mQ23);
      mSum = mSum.add(mPow23);
    }
    return Z.valueOf(mK);
  }
}
