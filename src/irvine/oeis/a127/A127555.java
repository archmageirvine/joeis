package irvine.oeis.a127;

import irvine.oeis.a014.A014574;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A127555 Decimal expansion of the number 4.164393920313549053413239828743... having continued fraction expansion 4, 6, 12, 18, 30, 42, 60, 72, 102, ... (averages of twin primes A014574).
 * @author Sean A. Irvine
 */
public class A127555 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A127555() {
    super(1, new A014574());
  }
}
