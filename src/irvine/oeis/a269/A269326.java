package irvine.oeis.a269;

import irvine.oeis.FiniteSequence;

/**
 * A269326 Let k be a number which is simultaneously Sierpi\u0144ski and Riesel, and let P be a set of primes which cover every number of the form k*2^m + 1 and of the form k*2^m - 1 with m &gt;= 1. Sequence shows elements of the set P which has the property that the product of its primes is as small as it is possible.
 * @author Georg Fischer
 */
public class A269326 extends FiniteSequence {

  /** Construct the sequence. */
  public A269326() {
    super(1, FINITE, 3, 5, 7, 11, 13, 17, 19, 31, 37, 41, 61, 73, 97, 109, 151, 241, 257, 331);
  }
}
