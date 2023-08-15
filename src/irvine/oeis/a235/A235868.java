package irvine.oeis.a235;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061345;

/**
 * A235868 Union of 2 and powers of odd primes.
 * @author Georg Fischer
 */
public class A235868 extends AbstractSequence {

  private long mN = 0;
  private final A061345 mSeq = new A061345();

  /** Construct the sequence. */
  public A235868() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    return (++mN <= 2) ? Z.valueOf(mN) : mSeq.next();
  }
}
