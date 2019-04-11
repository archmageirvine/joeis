package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228598 The Wiener index of the graph obtained by applying Mycielski's construction to the crown graph G(n) <code>(n&gt;=3)</code>.
 * @author Sean A. Irvine
 */
public class A228598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228598() {
    super(new long[] {1, -3, 3}, new long[] {141, 240, 365});
  }
}
