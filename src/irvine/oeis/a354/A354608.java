package irvine.oeis.a354;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A354608 Number of quadruples (p_1, ..., p_4) of positive integers such that p_{i-1} &lt;= p_i &lt;= n^(i-1).
 * @author Georg Fischer
 */
public class A354608 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A354608() {
    super(0, "[[0],[0,-2, 1,-1,-7, 3, 0,-6],[6,-52, 95,-35,-65, 81,-36, 6]]", "0, 1", 0);
  }
}
