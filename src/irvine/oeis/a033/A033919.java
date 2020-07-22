package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033919 Odd k for which <code>k+2^m</code> is composite for all m <code>&lt;</code> k.
 * @author Sean A. Irvine
 */
public class A033919 implements Sequence {

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
