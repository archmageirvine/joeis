package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056020 Numbers that are congruent to +-1 mod 9.
 * @author Sean A. Irvine
 */
public class A056020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056020() {
    super(new long[] {-1, 1, 1}, new long[] {1, 8, 10});
  }
}
