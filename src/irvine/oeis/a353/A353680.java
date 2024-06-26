package irvine.oeis.a353;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000035;

/**
 * A353680 a(n) = 1 if n is odd and phi(sigma(n)) is equal to phi(n), otherwise 0.
 * @author Georg Fischer
 */
public class A353680 extends AbstractSequence {

  private final A000035 mSeq1 = new A000035();
  private final A353637 mSeq2 = new A353637();

  /** Construct the sequence. */
  public A353680() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
