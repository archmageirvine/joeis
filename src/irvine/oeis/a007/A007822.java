package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a001.A001415;

/**
 * A007822 Number of symmetric foldings of <code>2n+1</code> stamps.
 * @author Sean A. Irvine (port to Java)
 */
public class A007822 extends A001415 {

  private int mN = 1;
  private long mCount = 0;

  private boolean isSymmetric(final int[] c, final int delta) {
    for (int k = 0; k < (c.length - 1) / 2; ++k) {
      if (c[(delta + k) % c.length] != c[(delta + c.length - 2 - k) % c.length]) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected void process(final int[] a, final int[] b, final int n) {
    final int[] c = new int[a.length];
    int j = 0;
    for (int k = 0; k < b.length; k++) {
      c[k] = b[j] - j;
      j = b[j];
    }
    for (int k = 0; k < a.length; ++k) {
      if (isSymmetric(c, k)) {
        ++mCount;
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mCount = 0;
    foldings(new int[] {mN - 1}, true, 0, 0);
    return Z.valueOf((mCount + 1) / 2);
  }
}
