package irvine.oeis.a258;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a255.A255982;

/**
 * A258421 Number of partitions of the 7-dimensional hypercube resulting from a sequence of n bisections, each of which splits any part perpendicular to any of the axes, such that each axis is used at least once.
 * @author Georg Fischer
 */
public class A258421 extends AbstractSequence {

  private final A255982 mSeq = new A255982();

  /** Construct the sequence. */
  public A258421() {
    super(7);
  }

  private int mN = 6;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 7);
  }
}

