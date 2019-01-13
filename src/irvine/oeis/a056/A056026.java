package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056026.
 * @author Sean A. Irvine
 */
public class A056026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056026() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 26, 199, 224, 226});
  }
}
