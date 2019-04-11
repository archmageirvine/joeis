package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056020 Numbers n that are congruent to <code>+-1 mod 9</code>.
 * @author Sean A. Irvine
 */
public class A056020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056020() {
    super(new long[] {-1, 1, 1}, new long[] {1, 8, 10});
  }
}
