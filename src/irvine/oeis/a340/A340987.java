package irvine.oeis.a340;
// manually build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060642;

/**
 * A340987 Number of colored integer partitions of 2n such that all colors from an n-set are used.
 * @author Georg Fischer
 */
public class A340987 extends AbstractSequence {

  private final A060642 mSeq = new A060642();

  /** Construct the sequence. */
  public A340987() {
    super(0);
  }

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(2 * mN + 1, mN);
  }
}

