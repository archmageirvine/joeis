package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033919 Odd k for which k+2^m is composite for all m &lt; k.
 * @author Sean A. Irvine
 */
public class A033919 extends Sequence1 {

  private int mN = 771;

  private boolean isA033919(final int n) {
    Z t = Z.ONE;
    for (int k = 1; k < n; ++k) {
      t = t.multiply2();
      if (t.add(n).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (isA033919(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
