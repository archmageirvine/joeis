package irvine.oeis.a183;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A183565 Number of partitions of n containing a clique of size 8.
 * @author Georg Fischer
 */
public class A183565 extends AbstractSequence {

  private final A183568 mSeq = new A183568();

  /** Construct the sequence. */
  public A183565() {
    super(8);
  }

  private int mN = 7;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 8);
  }
}

