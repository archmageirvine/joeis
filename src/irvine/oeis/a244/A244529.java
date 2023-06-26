package irvine.oeis.a244;

import irvine.oeis.FiniteSequence;

/**
 * A244529 Prime numbers whose decimal expansion contains no repeated digits or zeros, whose digits cannot be rearranged to form another prime number.
 * @author Georg Fischer
 */
public class A244529 extends FiniteSequence {

  /** Construct the sequence. */
  public A244529() {
    super(1, FINITE, 2, 3, 5, 7, 19, 23, 29, 41, 43, 47, 53, 59, 61, 67, 83, 89, 257, 263, 269, 431, 487, 523, 541, 827, 829, 853, 859, 2861, 5623, 5849);
  }
}
