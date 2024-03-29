package irvine.oeis.a341;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060642;

/**
 * A341236 Expansion of (-1 + Product_{k&gt;=1} 1 / (1 - x^k))^10.
 * @author Georg Fischer
 */
public class A341236 extends AbstractSequence {

  private final A060642 mSeq = new A060642();

  /** Construct the sequence. */
  public A341236() {
    super(10);
  }

  private int mN = 8;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 9);
  }
}

