package irvine.oeis.a068;
// Generated by gen_seq4.pl anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000312;
import irvine.oeis.a003.A003415;

/**
 * A068327 Arithmetic derivative of n^n.
 * @author Georg Fischer
 */
public class A068327 extends AbstractSequence {

  private final A000312 mSeq1 = new A000312();
  private final A003415 mSeq2 = new A003415();

  /** Construct the sequence. */
  public A068327() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
