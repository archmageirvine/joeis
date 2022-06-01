package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027656 Expansion of 1/(1-x^2)^2 (included only for completeness - the policy is always to omit the zeros from such sequences).
 * @author Sean A. Irvine
 */
public class A027656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027656() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 2, 0});
  }
}
