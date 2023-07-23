package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a040.A040025;

/**
 * A039657 Number of digits in all (2n+1)-digit palindromic primes.
 * @author Sean A. Irvine
 */
public class A039657 extends AbstractSequence {

  private final A040025 mSeq1 = new A040025();

  /** Construct the sequence. */
  public A039657() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return mSeq1.next().multiply(mN);
  }
}
