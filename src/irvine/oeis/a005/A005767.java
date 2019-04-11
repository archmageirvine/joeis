package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005767 Solutions n to <code>n^2 = a^2 +</code> b^2 + c^2 <code>(a</code>,b,c <code>&gt; 0)</code>.
 * @author Sean A. Irvine
 */
public class A005767 implements Sequence {

  private long mN = 2;

  private boolean isA005767(final long n) {
    final long m = n % 5 == 0 ? n / 5 : n;
    long r = n;
    int c = 1;
    while ((r & 1) == 0) {
      r >>>= 1;
      c <<= 1;
    }
    return m == c;
  }

  @Override
  public Z next() {
    while (isA005767(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
