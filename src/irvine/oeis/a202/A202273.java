package irvine.oeis.a202;

import irvine.oeis.FiniteSequence;

/**
 * A202273 Positive integers m in increasing order determined by these rules: <code>a(1) = 1</code>, for <code>n&gt;=1</code>, if m is in the sequence then also are numbers h such that <code>sigma(h) = 3m</code>.
 * @author Georg Fischer
 */
public class A202273 extends FiniteSequence {

  /** Construct the sequence. */
  public A202273() {
    super(1, 2, 5, 8, 14, 15, 20, 23, 24, 26, 30, 38, 40, 41, 45, 46, 51, 54, 55, 56, 58, 59, 60, 71, 74, 78, 87, 88, 89, 90, 92, 95, 106, 113, 118, 123, 136, 137, 143, 145, 146, 153, 167, 173, 178, 179, 215, 233, 263, 269, 303, 317, 335, 353);
  }
}
