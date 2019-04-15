package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156232 <code>a(n)</code> is the number of induced subgraphs with odd number of edges in the cycle graph <code>C(n)</code>.
 * @author Sean A. Irvine
 */
public class A156232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156232() {
    super(new long[] {-4, 2, 2}, new long[] {0, 4, 4});
  }
}
