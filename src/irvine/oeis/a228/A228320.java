package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228320 The Wiener index of the graph obtained by applying Mycielski's construction to the cycle graph C(n).
 * @author Sean A. Irvine
 */
public class A228320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228320() {
    super(new long[] {1, -3, 3}, new long[] {203, 280, 369});
  }
}
