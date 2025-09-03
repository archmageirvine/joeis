package irvine.oeis.a080;

import irvine.oeis.FilterSequence;

/**
 * A080076 Proth primes: primes of the form k*2^m + 1 with odd k &lt; 2^m, m &gt;= 1.
 * @author Sean A. Irvine
 */
public class A080076 extends FilterSequence {

  /** Construct the sequence. */
  public A080076() {
    super(new A080075(), PRIME);
  }
}

