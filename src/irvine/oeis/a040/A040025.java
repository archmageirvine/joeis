package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a016.A016115;

/**
 * A040025 a(n) is the number of prime palindromes with 2n+1 digits.
 * @author Sean A. Irvine
 */
public class A040025 extends AbstractSequence {

  private final A016115 mSeq1 = new A016115();

  /** Construct the sequence. */
  public A040025() {
    super(0);
  }

  @Override
  public Z next() {
    final Z r = mSeq1.next();
    mSeq1.next();
    return r;
  }
}
