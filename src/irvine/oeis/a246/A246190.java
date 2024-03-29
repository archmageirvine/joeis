package irvine.oeis.a246;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A246190 Number of endofunctions on [n] where the smallest cycle length equals 3.
 * @author Georg Fischer
 */
public class A246190 extends AbstractSequence {

  private final A246049 mSeq = new A246049();

  /** Construct the sequence. */
  public A246190() {
    super(3);
  }

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 3);
  }
}

