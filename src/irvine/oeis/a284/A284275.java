package irvine.oeis.a284;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a007.A007053;

/**
 * A284275 Number of primes between n and 2^n exclusive.
 * @author Georg Fischer
 */
public class A284275 extends AbstractSequence {

  private int mN = 0;
  private final A007053 mSeq1 = new A007053();
  private final A000720 mSeq2 = new A000720();

  /** Construct the sequence. */
  public A284275() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 1) ? Z.ZERO : result;
  }
}
