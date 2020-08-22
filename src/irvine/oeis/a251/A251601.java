package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251601 Numbers n such that hexagonal numbers H(n) and H(n+1) sum to another hexagonal number.
 * @author Sean A. Irvine
 */
public class A251601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251601() {
    super(new long[] {1, -35, 35}, new long[] {0, 13, 450});
  }
}
