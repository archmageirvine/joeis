package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;
import irvine.util.string.StringUtils;

/**
 * A061490 Smallest number which when iterated n times under A003285 gives a square.
 * @author Sean A. Irvine
 */
public class A061490 extends A003285 {

  /** Construct the sequence. */
  public A061490() {
    super(0);
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;

  private boolean is(final long k, final int n) {
    Z t = Z.valueOf(k);
    for (int j = 0; j < n; ++j) {
      if (t.isSquare()) {
        return false;
      }
      t = period(t);
    }
    return t.isSquare();
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (is(++k, mN)) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 100000 == 0) {
        StringUtils.message("n=" + mN + " search completed to " + k);
      }
    }
  }
}

