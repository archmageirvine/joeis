package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228597 The Wiener index of the graph obtained by applying Mycielski's construction to a benzenoid consisting of a linear chain of n hexagons.
 * @author Sean A. Irvine
 */
public class A228597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228597() {
    super(new long[] {1, -3, 3}, new long[] {141, 445, 941});
  }
}
