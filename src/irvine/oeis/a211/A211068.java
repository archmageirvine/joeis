package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211068.
 * @author Sean A. Irvine
 */
public class A211068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211068() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 3, 20, 48, 144, 243, 528, 768, 1400});
  }
}
