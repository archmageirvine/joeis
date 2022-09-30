package irvine.oeis.a355;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355674 Decimal expansion of 1351/780.
 * @author Georg Fischer
 */
public class A355674 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355674() {
    super(1, "[0,1,-1,1,-1,1,-1]", "1,7,3,2,0,5,1,2,8", 0);
  }
}
