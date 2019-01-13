package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227712.
 * @author Sean A. Irvine
 */
public class A227712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227712() {
    super(new long[] {2, -5, 4}, new long[] {4, 10, 25});
  }
}
