package irvine.oeis.a098;
// manually 2021-06-26

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A098941 Numbers where 2 is the only even decimal digit.
 * @author Georg Fischer
 */
public class A098941 extends AbstractSequence {

  protected int mN;
  protected String mPattern;
  protected int mBase;

  /** Construct the sequence. */
  public A098941() {
    this(1, 10, "[123579]*2[123579]*");
  }

  /**
   * Generic constructor with parameter
   * @param offset first index
   * @param base base of number system
   * @param pattern pattern to be matched
   */
  public A098941(final int offset, final int base, final String pattern) {
    super(offset);
    mN = -1; // always try to start with 0
    mBase = base;
    mPattern = pattern;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Integer.toString(mN, mBase).matches(mPattern)) {
        return Z.valueOf(mN);
      }
    }
  }
}
