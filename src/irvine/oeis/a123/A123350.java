package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123350.
 * @author Sean A. Irvine
 */
public class A123350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123350() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 14, 46, 117});
  }
}
