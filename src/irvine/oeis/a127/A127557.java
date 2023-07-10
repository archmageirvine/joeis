package irvine.oeis.a127;

import irvine.oeis.a006.A006562;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A127557 Decimal expansion of the number 5.018865657377378233714156283... having continued fraction expansion 5, 53, 157, 173, 211, 257, 263, 373, 563, ... (balanced primes order one A006562).
 * @author Sean A. Irvine
 */
public class A127557 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A127557() {
    super(1, new A006562());
  }
}
