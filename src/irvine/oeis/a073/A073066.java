package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A073066 Least k such that n*prime(k) &lt;= k*tau(k).
 * @author Sean A. Irvine
 */
public class A073066 extends Sequence1 {

  private final Sequence mPrimes = new A000040();
  private Z mP = mPrimes.next();
  private long mN = 0;
  private long mK = 1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.multiply(mN).compareTo(Functions.SIGMA0.z(mK).multiply(mK)) <= 0) {
        return Z.valueOf(mK);
      }
      ++mK;
      mP = mPrimes.next();
    }
  }
}
