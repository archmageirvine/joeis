package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A077669 Triangle read by rows. Let k = n-th composite number. Then n-th row gives n smallest numbers unrelated to k (numbers which do not divide k, are not divisible by k and are not coprime to k).
 * @author Sean A. Irvine
 */
public class A077669 extends A002808 {

  private long mN = 0;
  private long mM = 0;
  private long mK = 0;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mC = super.next().longValueExact();
      mM = 0;
      mK = 3;
    }
    while (true) {
      if (++mK % mC != 0 && mC % mK != 0 && Functions.GCD.l(mK, mC) != 1) {
        return Z.valueOf(mK);
      }
    }
  }
}
