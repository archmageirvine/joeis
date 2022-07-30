package irvine.oeis.a193;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A193576 T(n)^3+n^3 where T(n) is a triangular number.
 * @author Georg Fischer
 */
public class A193576 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A193576() {
    super(1, "[[0],[1],[-7],[21],[-35],[35],[-21],[7],[-1]]", "2, 35, 243, 1064, 3500, 9477, 22295, 47168", 0);
  }
}
