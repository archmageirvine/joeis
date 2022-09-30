package irvine.oeis.a298;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A298040 Coordination sequence of Dual(4.6.12) tiling with respect to a tetravalent node.
 * @author Georg Fischer
 */
public class A298040 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A298040() {
    super(0, "[0,-1,0,2,0,-1]", "1,4,20,24,40,40", 0);
  }
}
