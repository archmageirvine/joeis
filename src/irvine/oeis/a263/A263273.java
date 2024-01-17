package irvine.oeis.a263;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A263273 Bijective base-3 reverse: a(0) = 0; for n &gt;= 1, a(n) = A030102(A038502(n)) * A038500(n).
 * @author Georg Fischer
 */
public class A263273 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final int mBase;

  /** Construct the sequence. */
  public A263273() {
    this(0, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base number base
   */
  public A263273(final int offset, final int base) {
    super(offset);
    mN = -1;
    mBase = base;
  }

  @Override
  public Z a(final Z n) {
    if (n.isZero()) {
      return Z.ZERO;
    }
    final String t = new StringBuilder(n.toString(mBase)).reverse().toString();
    final String u = t.replaceAll("\\A0+", "");
    return new Z(u + t.substring(0, t.length() - u.length()), mBase);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
