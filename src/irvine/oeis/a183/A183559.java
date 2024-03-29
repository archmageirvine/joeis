package irvine.oeis.a183;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A183559 Number of partitions of n containing a clique of size 2.
 * @author Georg Fischer
 */
public class A183559 extends AbstractSequence {

  private final A183568 mSeq = new A183568();

  /** Construct the sequence. */
  public A183559() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 2);
  }
}

