package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102167 Lightest finite strictly increasing sequence of integers showing once and only once every pair of digits from <code>[00]</code> to <code>[99]</code>. The "weight" of such a sequence is the sum of all its <code>a(n)</code>. Weight of this sequence is 2995.
 * @author Georg Fischer
 */
public class A102167 extends FiniteSequence {

  /** Construct the sequence. */
  public A102167() {
    super(7, 19, 20, 23, 24, 25, 26, 27, 28, 29, 30, 34, 35, 36, 37, 38, 39, 40, 45, 46, 47, 48, 49, 50, 56, 57, 58, 59, 60, 67, 68, 69, 70, 78, 79, 80, 88, 90, 99, 100, 118, 122, 133, 144, 155, 166, 177);
  }
}
