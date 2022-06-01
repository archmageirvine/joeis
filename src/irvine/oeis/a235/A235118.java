package irvine.oeis.a235;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A235118 Number of independent vertex subsets of the graph obtained by attaching two pendant edges to each vertex of the ladder graph L_n (L_n is the 2 X n grid graph; see A235117).
 * @author Sean A. Irvine
 */
public class A235118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235118() {
    super(new long[] {64, 20}, new long[] {1, 24});
  }
}
