package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263942.
 * @author Sean A. Irvine
 */
public class A263942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263942() {
    super(new long[] {1, -5, 5}, new long[] {6, 28, 110});
  }
}
