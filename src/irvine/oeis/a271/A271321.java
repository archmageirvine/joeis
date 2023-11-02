package irvine.oeis.a271;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a060.A060354;

/**
 * A271321 Smallest prime factor of the n-th n-gonal number (A060354).
 * @author Georg Fischer
 */
public class A271321 extends AbstractSequence {

  private final Sequence mSeq1 = new A060354().skip(2);

  /** Construct the sequence. */
  public A271321() {
    super(2);
  }

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(mSeq1.next());
  }
}
