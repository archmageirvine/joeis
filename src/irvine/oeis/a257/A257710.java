package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257710 Numbers n such that T(n) + T(n+1) + ... + T(n+36) is a square, where T = A000217 (triangular numbers).
 * @author Sean A. Irvine
 */
public class A257710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257710() {
    super(1, new long[] {1, -1, 0, 0, 0, 0, 0, 0, -7398, 7398, 0, 0, 0, 0, 0, 0, 1}, new long[] {5, 32, 291, 661, 4102, 8515, 13685, 113558, 182368, 377701, 2290342, 5027232, 30483491, 63130838, 101378488, 840238915, 1349295285});
  }
}
