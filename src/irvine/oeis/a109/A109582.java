package irvine.oeis.a109;
// manually 2021-06-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A109582 E.g.f.: -1/(1+x-x^3).
 * @author Georg Fischer
 */
public class A109582 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A109582() {
    super(0, "[[0],[1],[0],[-1],[-1]]", "[-1, 1,-2, 0, 24]");
    setGfType(1);
  }
}
