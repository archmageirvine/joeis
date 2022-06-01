package irvine.oeis.a344;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A344191 a(n) = Catalan(n) * (n^2 + 2) / (n + 2).
 * @author Georg Fischer
 */
public class A344191 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A344191() {
    super(0, "[[0],[4,-8, 2,-4],[6,-1, 0, 1]]", "1", 0);
  }
}
