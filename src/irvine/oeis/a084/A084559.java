package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A084559 Smallest a(n) &gt; n such that concatenation of numbers from n to a(n) is a prime or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A084559 extends Sequence2 {

  private long mN = 1;
  private long mMul = 10;

  @Override
  public Z next() {
    if (++mN >= mMul) {
      mMul *= 10;
    }
    Z t = Z.valueOf(mN);
    long k = mN;
    long m = mMul;
    while (true) {
      if (++k >= m) {
        m *= 10;
      }
      t = t.multiply(m).add(k);
      if (t.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

