package irvine.oeis.a323;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a214.A214258;

/**
 * A323121 Number of compositions of n where the difference between largest and smallest parts equals four.
 * @author Georg Fischer
 */
public class A323121 extends AbstractSequence {

  private final A214258 mSeq = new A214258();

  /** Construct the sequence. */
  public A323121() {
    super(4);
  }

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 4);
  }
}

