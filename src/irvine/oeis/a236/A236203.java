package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236203 Interleave A005563(n), A028347(n).
 * @author Sean A. Irvine
 */
public class A236203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236203() {
    super(2, new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 3, 5, 8});
  }
}
