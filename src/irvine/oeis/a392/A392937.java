package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A392937 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A392937 extends A000796 {

  private final StringBuilder mPi = new StringBuilder();
  private int mN = 0;
  private int mM = 0;
  private int mLen = 1024;

  private void extend(final int len) {
    while (mPi.length() < len) {
      mPi.append(super.next());
    }
  }

  private Z t(final int n, final int m) {
    final String s = mPi.substring(m, n + m);
    while (true) {
      final int pos = mPi.indexOf(s, m + 1);
      if (pos >= 0) {
        return Z.valueOf(pos + 1);
      }
      mLen *= 2;
      extend(mLen);
    }
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      extend(mLen);
    }
    return t(mN - mM, mM);
  }
}
