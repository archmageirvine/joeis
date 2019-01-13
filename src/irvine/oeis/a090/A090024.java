package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090024.
 * @author Sean A. Irvine
 */
public class A090024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090024() {
    super(new long[] {270, -579, 430, -140, 20}, new long[] {0, 1, 45, 571, 5841});
  }
}
