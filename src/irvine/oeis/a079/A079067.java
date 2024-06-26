package irvine.oeis.a079;
// Generated by gen_seq4.pl anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001221;
import irvine.oeis.a061.A061395;

/**
 * A079067 Number of primes less than greatest prime factor of n but not dividing n.
 * @author Georg Fischer
 */
public class A079067 extends AbstractSequence {

  private final A061395 mSeq1 = new A061395();
  private final A001221 mSeq2 = new A001221();

  /** Construct the sequence. */
  public A079067() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
