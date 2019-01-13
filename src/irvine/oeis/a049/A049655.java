package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049655.
 * @author Sean A. Irvine
 */
public class A049655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049655() {
    super(new long[] {1, -48, 48}, new long[] {0, 18, 861});
  }
}
