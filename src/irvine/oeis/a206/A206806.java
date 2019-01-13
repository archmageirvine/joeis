package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206806.
 * @author Sean A. Irvine
 */
public class A206806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206806() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {1, 4, 13, 30, 62, 112, 190});
  }
}
