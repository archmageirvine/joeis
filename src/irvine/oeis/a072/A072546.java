package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072546 Sequence related to Fibonacci and "tribonacci" sequences : let f(1)=1, f(2)=n, f(k+2)=f(k+1)+f(k), t(1)=t(2)=t(3)=1, t(k+3)=t(k+2)+t(k+1)+t(k) (t(k)=A000213(k-1)); sequence gives the smallest value k = a(n) such that t(k)&gt;f(k).
 * @author Sean A. Irvine
 */
public class A072546 extends Sequence1 {

  private long mN = 0;
  private Z mT1 = Z.ONE;
  private Z mT2 = Z.ONE;
  private Z mT3 = Z.ONE;
  private long mK = 3;

  @Override
  public Z next() {
    Z fa = Z.ONE;
    Z fb = Z.valueOf(++mN);
    for (long j = 3; j <= mK; ++j) {
      final Z fc = fa.add(fb);
      fa = fb;
      fb = fc;
    }
    while (mT3.compareTo(fb) <= 0) {
      final Z t = mT1.add(mT2).add(mT3);
      mT1 = mT2;
      mT2 = mT3;
      mT3 = t;
      final Z fc = fa.add(fb);
      fa = fb;
      fb = fc;
      ++mK;
    }
    return Z.valueOf(mK);
  }
}
