package irvine.oeis.a130;

import irvine.oeis.FiniteSequence;

/**
 * A130432 For digit n from 1 to 9, a(n) = the number of numbers m such that m is equal to the number of n's in the decimal digits of all numbers &lt;= m.
 * @author Georg Fischer
 */
public class A130432 extends FiniteSequence {

  /** Construct the sequence. */
  public A130432() {
    super(84, 14, 36, 48, 5, 72, 49, 344, 9);
  }
}
