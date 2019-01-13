package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263945.
 * @author Sean A. Irvine
 */
public class A263945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263945() {
    super(new long[] {1, -1, -1298, 1298, 1}, new long[] {26, 871, 59930, 1155895, 77814386});
  }
}
