package irvine.oeis.a126;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A126694 Expansion of g.f.: 1/(1 - 7*x*c(x)), where c(x) is the g.f. for A000108.
 * @author Georg Fischer
 */
public class A126694 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126694() {
    super(0, "[[0],[-294, 490,-196],[36,-109, 73],[0, 6,-6]]", "1, 7", 0);
  }
}
