package irvine.oeis.a038;
// manually 2021-08-07

import irvine.oeis.NoncomputableSequence;

/**
 * A038842 Primes which when converted to base 36 make English words.
 * The primes were matched against Caldwell's 
 * <a href="http://www.utm.edu/research/primes/notes/words.html">The Prime Lexicon</a>,
 * they are not computable here.
 * @author Georg Fischer
 */
public class A038842 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A038842() {
    super(11, 13, 17, 19, 23, 29, 31, 373, 383, 389, 457, 461, 467, 479, 487, 503, 521, 569, 601, 641,
          659, 661, 677, 821, 859, 877, 881, 887, 929, 1019, 1021, 1061, 1103, 1109, 1129, 1181, 1237, 13337, 
          13421, 13441, 13463, 14033, 14629, 14633, 14639, 14783, 15131);
  }
}
