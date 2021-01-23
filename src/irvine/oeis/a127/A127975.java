package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127975 Repeat 3^n three times.
 * @author Sean A. Irvine
 */
public class A127975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127975() {
    super(new long[] {3, 0, 0}, new long[] {1, 1, 1});
  }
}
