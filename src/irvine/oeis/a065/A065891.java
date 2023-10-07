package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065891 The a(n)-th composite number is 2^n.
 * @author Sean A. Irvine
 */
public class A065891 extends A002808 {

  {
    setOffset(2);
  }

  private long mM = 0;
  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.multiply2();
    while (true) {
      ++mM;
      if (mN.equals(super.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}
