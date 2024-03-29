package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A048385 In base-10 notation replace digits of n with their squared values (Version 1).
 * @author Sean A. Irvine
 */
public class A048385 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A048385(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A048385() {
    super(0);
  }

  static final String[] EXPANSIONS = {
    "0",
    "1",
    "4",
    "9",
    "61", // we do a reverse later!
    "52",
    "63",
    "94",
    "46",
    "18"
  };
  private long mN = -1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    long m = ++mN;
    do {
      sb.append(EXPANSIONS[(int) (m % 10)]);
      m /= 10;
    } while (m != 0);
    return new Z(sb.reverse());
  }

  @Override
  public Z a(final int n) {
    final StringBuilder sb = new StringBuilder();
    long m = n;
    do {
      sb.append(EXPANSIONS[(int) (m % 10)]);
      m /= 10;
    } while (m != 0);
    return new Z(sb.reverse());
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

}
