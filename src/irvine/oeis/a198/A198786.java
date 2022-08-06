package irvine.oeis.a198;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A198786 G.f. satisfies: A(x) = 1 + 2*x*sqrt(A(x)/A(-x)).
 * @author Georg Fischer
 */
public class A198786 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A198786() {
    super(0, "[[0],[60, 8,-4],[32, 8,-4],[6,-1,-1],[2,-1,-1]]", "1, 2, 4, 4", 0);
  }
}
