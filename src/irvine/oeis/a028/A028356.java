package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028356 Simple periodic sequence underlying clock sequence A028354.
 * @author Sean A. Irvine
 */
public class A028356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028356() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 2, 3, 4});
  }
}
