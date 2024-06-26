package irvine.oeis.a361;
// Generated by gen_seq4.pl anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A361712 a(n) = Sum_{k = 0..n-1} binomial(n,k)^2*binomial(n+k,k)*binomial(n+k-1,k).
 * @author Georg Fischer
 */
public class A361712 extends AbstractSequence {

  private final A361878 mSeq1 = new A361878();
  private final A361877 mSeq2 = new A361877();

  /** Construct the sequence. */
  public A361712() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
