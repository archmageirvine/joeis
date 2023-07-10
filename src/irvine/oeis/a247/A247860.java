package irvine.oeis.a247;

import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002496;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A247860 Decimal expansion of the value of the continued fraction [0; 2, 5, 17, 37, 101, 197, ...], generated with primes of the form n^2 + 1.
 * @author Sean A. Irvine
 */
public class A247860 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A247860() {
    super(0, new PrependSequence(new A002496(), 0));
  }
}
