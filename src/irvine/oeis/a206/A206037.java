package irvine.oeis.a206;
// Generated by gen_seq4.pl simple3 at 2023-03-24 12:16

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a115.A115334;

/**
 * A206037 Values of the difference d for 3 primes in arithmetic progression with the minimal start sequence {3 + j*d}, j = 0 to 2.
 * @author Georg Fischer
 */
public class A206037 extends AbstractSequence {

  private int mN = 0;
  private final A115334 mSeq = new A115334();

  /** Construct the sequence. */
  public A206037() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mSeq.next());
  }
}
