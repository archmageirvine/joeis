package irvine.oeis.a130;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a062.A062457;
import irvine.oeis.a093.A093360;

/**
 * A130606 a(n) = prime(n+1)^n - prime(n)^n where prime(n) is the n-th prime number.
 * @author Georg Fischer
 */
public class A130606 extends AbstractSequence {

  private final A093360 mSeq1 = new A093360();
  private final A062457 mSeq2 = new A062457();

  /** Construct the sequence. */
  public A130606() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
