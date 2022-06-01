package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251602 Numbers n such that hexagonal number H(n) is the sum of two consecutive hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A251602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251602() {
    super(new long[] {1, -35, 35}, new long[] {1, 19, 637});
  }
}
