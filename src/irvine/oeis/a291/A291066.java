package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291066 Number of edges in the n-Menger sponge graph.
 * @author Sean A. Irvine
 */
public class A291066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291066() {
    super(new long[] {-160, 28}, new long[] {24, 672});
  }
}
