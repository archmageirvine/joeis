package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156846 a(n) = 12167n - 3588.
 * @author Sean A. Irvine
 */
public class A156846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156846() {
    super(1, new long[] {-1, 2}, new long[] {8579, 20746});
  }
}
