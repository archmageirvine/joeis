package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257710 Numbers n such that <code>T(n) + T(n+1) +</code> ... <code>+ T(n+36)</code> is a square, where T <code>= A000217</code> (triangular numbers).
 * @author Sean A. Irvine
 */
public class A257710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257710() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, -7398, 7398, 0, 0, 0, 0, 0, 0, 1}, new long[] {5, 32, 291, 661, 4102, 8515, 13685, 113558, 182368, 377701, 2290342, 5027232, 30483491, 63130838, 101378488, 840238915, 1349295285});
  }
}
