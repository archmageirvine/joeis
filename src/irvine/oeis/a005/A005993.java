package irvine.oeis.a005;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A005993 Expansion of (1+x^2)/((1-x)^2*(1-x^2)^2).
 * @author Georg Fischer
 */
public class A005993 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A005993() {
    super(0, "[[0],[-1],[2],[1],[-4],[1],[2],[-1]]", "1,2,6", 0);
  }
}
