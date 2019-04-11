package irvine.oeis.a051;

import irvine.oeis.FiniteSequence;

/**
 * A051882 Call m strict-sense Egyptian if we can partition m = x_1+x_2+...+x_k into distinct positive integers x_i such that Sum_{i=1..k} 1/x_i <code>= 1</code>; sequence gives all numbers that are not strict-sense Egyptian.
 * @author Georg Fischer
 */
public class A051882 extends FiniteSequence {

  /** Construct the sequence. */
  public A051882() {
    super(2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 33, 34, 35, 36, 39, 40, 41, 42, 44, 46, 47, 48, 49, 51, 56, 58, 63, 68, 70, 72, 77);
  }
}
