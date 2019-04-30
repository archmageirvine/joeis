package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228318 The Wiener index of the graph obtained by applying Mycielski's construction to the star graph <code>K(1,n)</code>.
 * @author Sean A. Irvine
 */
public class A228318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228318() {
    super(new long[] {1, -3, 3}, new long[] {15, 33, 59});
  }
}
