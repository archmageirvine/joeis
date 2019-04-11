package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054344 Number of ways of covering <code>a 2n</code> X <code>2n</code> lattice with <code>2n^2</code> dominoes of which exactly 6 are horizontal (or vertical) dominoes.
 * @author Sean A. Irvine
 */
public class A054344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054344() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {9, 1064, 21656, 197484, 1143366, 4927524, 17240292, 51631617, 137044523, 330284988});
  }
}
