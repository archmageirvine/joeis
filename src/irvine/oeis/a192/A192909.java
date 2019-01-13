package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192909.
 * @author Sean A. Irvine
 */
public class A192909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192909() {
    super(new long[] {-1, 0, 1, -3, 4}, new long[] {1, 1, 3, 9, 27});
  }
}
