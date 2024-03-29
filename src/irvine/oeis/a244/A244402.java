package irvine.oeis.a244;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A244402 Number of unlabeled rooted trees with n nodes and maximal outdegree (branching factor) 6.
 * @author Georg Fischer
 */
public class A244402 extends AbstractSequence {

  private final A244372 mSeq = new A244372();

  /** Construct the sequence. */
  public A244402() {
    super(7);
  }

  private int mN = 5;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 6);
  }
}

