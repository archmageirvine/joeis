package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088942.
 * @author Sean A. Irvine
 */
public class A088942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088942() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 60, 390, 1450, 4045, 9421});
  }
}
