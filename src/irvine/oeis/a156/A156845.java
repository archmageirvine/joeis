package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156845 12167n - 8579.
 * @author Sean A. Irvine
 */
public class A156845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156845() {
    super(new long[] {-1, 2}, new long[] {3588, 15755});
  }
}
