package irvine.oeis.a109;

import irvine.oeis.FiniteSequence;

/**
 * A109065 Numerator of the fraction due in month n of the total interest for a one-year installment loan based on the Rule of 78s (each denominator is <code>78)</code>.
 * @author Georg Fischer
 */
public class A109065 extends FiniteSequence {

  /** Construct the sequence. */
  public A109065() {
    super(12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
  }
}
