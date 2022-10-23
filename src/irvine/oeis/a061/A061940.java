package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061940 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 11 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A061940 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mBase11 = new StringBuilder();

  protected int base() {
    return 11;
  }

  private Z bump(final long n) {
    final String v = Long.toString(n, base());
    int k = v.length() - 1;
    while (v.charAt(k) == '0') {
      --k;
    }
    while (k >= 0) {
      mBase11.append(v.charAt(k--));
    }
    return new Z(mBase11.toString(), 11);
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (bump(mN).mod(mN) != 0);
    return Z.valueOf(mN);
  }
}
