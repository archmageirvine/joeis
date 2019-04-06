package irvine.oeis.a093;

import irvine.oeis.FiniteSequence;

/**
 * A093899 Triangle read by rows, consisting of distinct positive integers such that the absolute difference of (horizontally or vertically) adjacent numbers is a (least possible) distinct prime.
 * @author Georg Fischer
 */
public class A093899 extends FiniteSequence {

  /** Construct the sequence. */
  public A093899() {
    super(1, 3, 6, 8, 19, 12, 25, 48, 79, 60, 62, 109, 38, 139, 96, 9, 182, 265, 42, 155, 66, 112, 291, 134, 241, 432);
  }
}
