package irvine.oeis.a161;

import irvine.oeis.HolonomicRecurrence;

/**
 * A161474 Triple factorials n!!!: a(n) = n*a(n-3).
 * @author Georg Fischer
 */
public class A161474 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A161474() {
    super(0, "[[0],[0, 1],[0],[0],[-1]", "1, 1, 1", 0);
  }
}
