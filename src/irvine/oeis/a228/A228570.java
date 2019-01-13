package irvine.oeis.a228;

import irvine.math.z.Z;
import irvine.oeis.a034.A034851;

/**
 * A228570.
 * @author Sean A. Irvine
 */
public class A228570 extends A034851 {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z t(final long n, final long k) {
    return super.t(n - 2 * k, k);
  }

  @Override
  public Z next() {
    if (++mM > mN / 3) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
