package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088581.
 * @author Sean A. Irvine
 */
public class A088581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088581() {
    super(new long[] {9, -15, 7}, new long[] {1, 4, 22});
  }
}
