package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102436 Number of matchings of the corona <code>L'(n)</code> of the ladder graph <code>L(n)=P_2 X P_n</code>. and the complete graph <code>K(1);</code> in other words, <code>L'(n)</code> is the graph constructed from <code>L(n)</code> by adding for each vertex v a new vertex v' and the edge vv'.
 * @author Sean A. Irvine
 */
public class A102436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102436() {
    super(new long[] {-1, 4, 6}, new long[] {1, 5, 34});
  }
}
