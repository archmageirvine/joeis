package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004489 Table of tersums m + n (answers written in base 10).
 * @author Sean A. Irvine
 */
public class A004489 extends AbstractSequence {

  /** Construct the sequence. */
  public A004489() {
    super(0);
  }

  private int r(final String s, final int n) {
    return n < 0 ? 0 : s.charAt(n) - '0';
  }

  protected Z tersum(final Z a, final Z b) {
    final String as = a.toString(3);
    final String bs = b.toString(3);
    final StringBuilder sb = new StringBuilder();
    for (int k = Math.max(as.length(), bs.length()); k >= 1; --k) {
      final int r = (r(as, as.length() - k) + r(bs, bs.length() - k)) % 3;
      sb.append(r);
    }
    return new Z(sb, 3);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return tersum(Z.valueOf(mM), Z.valueOf(mN - mM));
  }
}

