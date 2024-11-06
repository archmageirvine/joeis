package irvine.oeis.a101;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;

/**
 * A101081 Number of distinct prime factors of (prime p concatenated p times).
 * @author Georg Fischer
 */
public class A101081 extends AbstractSequence {

  private final AbstractSequence mSeq;
  private final int mIncr;
  private final StringBuilder mSb = new StringBuilder();

  /** Construct the sequence. */
  public A101081() {
    this(1, new A000040(), 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param incr increment for concatenation count
   */
  public A101081(final int offset, final AbstractSequence seq, final int incr) {
    super(offset);
    mSeq = seq;
    mIncr = incr;
  }

  @Override
  public Z next() {
    mSb.setLength(0);
    Z n = mSeq.next();
    final String s = n.toString();
    n = n.add(mIncr);
    while (!n.isZero()) {
      mSb.append(s);
      n = n.subtract(1);
    }
    return Functions.OMEGA.z(new Z(mSb.toString()));
  }
}
