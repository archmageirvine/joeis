package irvine.oeis.a060;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A060027 Expansion of (1-x-x^N)/((1-x)(1-x^2)(1-x^3)...(1-x^N)) for N = 8.
 * @author Georg Fischer
 */
public class A060027 extends CoordinationSequence {

  /** Construct the sequence. */
  public A060027() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, -1}, new int[] {1, 2, 3, 4, 5, 6, 7, 8});
  }
}
