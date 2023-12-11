package irvine.oeis.a048;

import irvine.oeis.a007.A007629;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A048970 Prime Keith numbers.
 * @author Sean A. Irvine
 */
public class A048970 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A048970() {
    super(new A007629());
  }
}

