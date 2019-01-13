package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155648.
 * @author Sean A. Irvine
 */
public class A155648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155648() {
    super(new long[] {60, -76, 17}, new long[] {1, 15, 135});
  }
}
