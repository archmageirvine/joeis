package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156845 <code>12167n - 8579</code>.
 * @author Sean A. Irvine
 */
public class A156845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156845() {
    super(new long[] {-1, 2}, new long[] {3588, 15755});
  }
}
