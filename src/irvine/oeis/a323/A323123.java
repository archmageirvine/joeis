package irvine.oeis.a323;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a214.A214258;

/**
 * A323123 Number of compositions of n where the difference between largest and smallest parts equals six.
 * @author Georg Fischer
 */
public class A323123 extends AbstractSequence {

  private final A214258 mSeq = new A214258();

  /** Construct the sequence. */
  public A323123() {
    super(6);
  }

  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 6);
  }
}

