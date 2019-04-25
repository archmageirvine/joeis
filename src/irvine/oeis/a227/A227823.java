package irvine.oeis.a227;

import irvine.oeis.FiniteSequence;

/**
 * A227823 Numbers n with property that each sum of <code>any</code> k-subsequence of digits of n with <code>k&gt;=2</code> is prime.
 * @author Georg Fischer
 */
public class A227823 extends FiniteSequence {

  /** Construct the sequence. */
  public A227823() {
    super(11, 12, 14, 16, 20, 21, 23, 25, 29, 30, 32, 34, 38, 41, 43, 47, 49, 50, 52, 56, 58, 61, 65, 67, 70, 74, 76, 83, 85, 89, 92, 94, 98, 111, 203, 205, 230, 250, 302, 320, 502, 520);
  }
}
