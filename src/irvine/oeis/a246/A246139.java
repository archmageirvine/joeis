package irvine.oeis.a246;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A246139 2^n + 10.
 * @author Sean A. Irvine
 */
public class A246139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246139() {
    super(new long[] {-2, 3}, new long[] {11, 12});
  }
}
