package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075460 Odd primitive numbers such that n! divided by product of factorials of all proper divisors of n is not an integer.
 * @author Sean A. Irvine
 */
public class A075460 extends FilterSequence {

  /** Construct the sequence. */
  public A075460() {
    super(new A075422(), ODD);
  }
}
