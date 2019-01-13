package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A016115.
 * @author Sean A. Irvine
 */
public class A016115 extends A002385 {

  private int mN = 0;
  private int mPrev = super.next().toString().length();

  @Override
  public Z next() {
    ++mN;
    if (mPrev > mN) {
      return Z.ZERO;
    }
    long c = 0;
    do {
      ++c;
      mPrev = super.next().toString().length();
    } while (mPrev == mN);
    return Z.valueOf(c);
  }
}
