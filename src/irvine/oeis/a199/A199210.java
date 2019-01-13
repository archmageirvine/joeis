package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199210.
 * @author Sean A. Irvine
 */
public class A199210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199210() {
    super(new long[] {-4, 5}, new long[] {4, 15});
  }
}
