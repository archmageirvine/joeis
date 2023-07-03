package irvine.oeis.a068;

import irvine.oeis.a006.A006784;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A068387 Prime coefficients in the Engel expansion of Pi = prime values in A006784(n).
 * @author Georg Fischer
 */
public class A068387 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A068387() {
    super(new A006784());
  }
}

