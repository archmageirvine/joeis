package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156232 a(n) is the number of induced subgraphs with odd number of edges in the cycle graph C(n).
 * @author Sean A. Irvine
 */
public class A156232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156232() {
    super(2, new long[] {-4, 2, 2}, new long[] {0, 4, 4});
  }
}
