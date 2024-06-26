package irvine.oeis.a340;
// Generated by gen_seq4.pl amoda

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001414;
import irvine.oeis.a023.A023896;

/**
 * A340297 a(n) = (Sum of totatives of n) mod (Sum of primes dividing n with multiplicity).
 * @author Georg Fischer
 */
public class A340297 extends Sequence2 {

  private final A023896 mSeq1 = new A023896();
  private final A001414 mSeq2 = new A001414();

  /** Construct the sequence. */
  public A340297() {
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().mod(mSeq2.next());
  }
}

