package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155465.
 * @author Sean A. Irvine
 */
public class A155465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155465() {
    super(new long[] {1, -7, 7}, new long[] {7, 88, 555});
  }
}
