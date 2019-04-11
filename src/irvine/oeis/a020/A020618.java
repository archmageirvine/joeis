package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020618 Smallest nonempty set S containing prime divisors of <code>8k+5</code> for each k in S.
 * @author Georg Fischer
 */
public class A020618 extends FiniteSequence {

  /** Construct the sequence. */
  public A020618() {
    super(3, 7, 11, 13, 17, 23, 29, 31, 47, 53, 59, 61, 67, 79, 109, 127, 541, 619, 661, 743, 877, 1021, 2333, 4957);
  }
}
