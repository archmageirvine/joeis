package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180577 The Wiener index of the windmill graph <code>D(6,n)</code>. The windmill graph <code>D(m,n)</code> is the graph obtained by taking n copies of the complete graph <code>K_m</code> with a vertex in common <code>(i.e.</code>, a bouquet of n pieces of <code>K_m graphs)</code>.
 * @author Sean A. Irvine
 */
public class A180577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180577() {
    super(new long[] {1, -3, 3}, new long[] {15, 80, 195});
  }
}
