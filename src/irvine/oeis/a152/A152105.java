package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152105 a(n) = ((8 + sqrt4)^n + (8 - sqrt4)^n)/2.
 * @author Sean A. Irvine
 */
public class A152105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152105() {
    super(new long[] {-60, 16}, new long[] {1, 8});
  }
}
