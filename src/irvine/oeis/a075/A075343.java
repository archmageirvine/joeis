package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075343 a(1) = 1, a(n+1) is the smallest number such that there are n composite numbers between a(n) and a(n+1) exclusive.
 * @author Sean A. Irvine
 */
public class A075343 extends Sequence1 {

  private Z mA = null;
  private int mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    ++mN;
    int k = 0;
    while (k < mN) {
      mA = mA.add(1);
      if (!mA.isProbablePrime()) {
        ++k;
      }
    }
    mA = mA.add(1);
    return mA;
  }
}
