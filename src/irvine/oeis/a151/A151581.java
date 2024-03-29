package irvine.oeis.a151;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a334.A334218;

/**
 * A151581 Number of permutations of 1..n arranged in a circle with exactly 8 adjacent element pairs in decreasing order.
 * @author Georg Fischer
 */
public class A151581 extends AbstractSequence {

  private final A334218 mSeq = new A334218();

  /** Construct the sequence. */
  public A151581() {
    super(8);
  }

  private int mN = 7;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 8);
  }
}

