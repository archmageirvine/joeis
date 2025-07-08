package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A048385 In base-10 notation replace digits of n with their squared values (Version 1).
 * @author Sean A. Irvine
 */
public class A048385 extends AbstractSequence implements DirectSequence {

  protected final String[] mExpansions;
  private int mN;

  /** Construct the sequence. */
  public A048385() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A048385(final int offset) {
    this(offset, new String[] {"0", "1", "4", "9", "16", "25", "36", "49", "64", "81"});
  }

  /**
   * Constructor with offset and expansions.
   * @param offset first index
   * @param expansions how to expand each digit
   */
  public A048385(final int offset, final String[] expansions) {
    super(offset);
    mExpansions = expansions;
    mN = offset - 1;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final int n) {
    final StringBuilder sb = new StringBuilder();
    long m = n;
    do {
      sb.insert(0, mExpansions[(int) (m % 10)]);
      m /= 10;
    } while (m != 0);
    return new Z(sb);
  }

  @Override
  public Z a(final Z n) {
    final StringBuilder sb = new StringBuilder();
    Z m = n;
    do {
      sb.insert(0, mExpansions[(int) (m.mod(10))]);
      m = m.divide(10);
    } while (!m.isZero());
    return new Z(sb);
  }

}
