package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206544.
 * @author Sean A. Irvine
 */
public class A206544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206544() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 9, 11, 11});
  }
}
