package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048380 Digits d in decimal expansion of n replaced with d-th prime (replacing each 0 digit with a 1).
 * @author Sean A. Irvine
 */
public class A048380 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A048380(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A048380() {
    super(0);
  }

  static final String[] EXPANSIONS = {
    "1",
    "2",
    "3",
    "5",
    "7",
    "11",
    "31", // we do a reverse later!
    "71",
    "91",
    "32"
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
}
