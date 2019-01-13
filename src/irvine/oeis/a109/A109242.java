package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109242.
 * @author Sean A. Irvine
 */
public class A109242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109242() {
    super(new long[] {1000, -1110, 111}, new long[] {1, 111, 11211});
  }
}
