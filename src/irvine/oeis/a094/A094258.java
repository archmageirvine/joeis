package irvine.oeis.a094;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A094258 a(1) = 1, a(n+1) = n*n! for n &gt;= 1.
 * Essentially the same as A001563.
 *
 * @author Georg Fischer
 */
public class A094258 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A094258() {
    super(1, "[[0],[1,-2, 1],[2,-1]]", "[1, 1, 4]", 0);
  }
}
