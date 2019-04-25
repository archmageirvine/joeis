package irvine.oeis.a003;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A003277 Cyclic numbers: n such that n and phi(n) are relatively prime; also n such that there is just one group of order <code>n, i</code>.e., A000001(n) <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A003277 implements Sequence {

  private int mN = 0;
  private int mLimit = 5;
  private Euler mEuler = null;

  @Override
  public Z next() {
    if (mN < 3) {
      return Z.valueOf(++mN);
    }
    while (true) {
      mN += 2;
      if (mN >= mLimit) {
        mLimit = 2 * mLimit + 3;
        mEuler = new Euler(mLimit);
      }
      if (LongUtils.gcd(mN, mEuler.phi(mN)) == 1) {
        return Z.valueOf(mN);
      }
    }
  }

}
