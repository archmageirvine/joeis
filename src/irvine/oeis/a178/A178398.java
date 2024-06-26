package irvine.oeis.a178;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a110.A110833;

/**
 * A178398 a(n) = p(p+1)^2, where p is the n-th prime.
 * @author Georg Fischer
 */
public class A178398 extends AbstractSequence {

  private final A000040 mSeq1 = new A000040();
  private final A110833 mSeq2 = new A110833();

  /** Construct the sequence. */
  public A178398() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
