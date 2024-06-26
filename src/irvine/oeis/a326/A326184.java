package irvine.oeis.a326;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a057.A057521;

/**
 * A326184 a(n) = sigma(n) - A057521(n), where A057521 gives the powerful part of n, and sigma gives the sum of divisors of n.
 * @author Georg Fischer
 */
public class A326184 extends AbstractSequence {

  private final A000203 mSeq1 = new A000203();
  private final A057521 mSeq2 = new A057521();

  /** Construct the sequence. */
  public A326184() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
