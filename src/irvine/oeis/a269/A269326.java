package irvine.oeis.a269;

import irvine.oeis.FiniteSequence;

/**
 * A269326 Let k be a number which is simultaneously Sierpi&#324;ski and Riesel, and let P be a set of primes which cover every number of the form k*2^m <code>+ 1</code> and of the form k*2^m <code>- 1</code> with m <code>&gt;= 1</code>. Sequence shows elements of the set P which has the property that the product of its primes is as small as it is possible.
 * @author Georg Fischer
 */
public class A269326 extends FiniteSequence {

  /** Construct the sequence. */
  public A269326() {
    super(3, 5, 7, 11, 13, 17, 19, 31, 37, 41, 61, 73, 97, 109, 151, 241, 257, 331);
  }
}
