package irvine.oeis.a069;

import irvine.oeis.FilterSequence;

/**
 * A069356 Primes of the form 2^i*3^j - (i+j) with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A069356 extends FilterSequence {

  /** Construct the sequence. */
  public A069356() {
    super(1, new A069355(), PRIME);
  }
}
