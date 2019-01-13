package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168384.
 * @author Sean A. Irvine
 */
public class A168384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168384() {
    super(new long[] {-1, 1, 1}, new long[] {6, 6, 14});
  }
}
