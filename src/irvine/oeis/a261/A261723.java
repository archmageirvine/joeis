package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261723 Interleave 2^n + 2 and 2^n + 1.
 * @author Sean A. Irvine
 */
public class A261723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261723() {
    super(1, new long[] {-2, 0, 3, 0}, new long[] {4, 3, 6, 5});
  }
}
