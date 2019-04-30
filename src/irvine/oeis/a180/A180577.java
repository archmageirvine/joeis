package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180577 The Wiener index of the windmill graph <code>D(6,n)</code>. The windmill graph D(m,n) is the graph obtained by taking n copies of the complete graph K_m with a vertex in common <code>(i</code>.e., a bouquet of n pieces of K_m graphs).
 * @author Sean A. Irvine
 */
public class A180577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180577() {
    super(new long[] {1, -3, 3}, new long[] {15, 80, 195});
  }
}
