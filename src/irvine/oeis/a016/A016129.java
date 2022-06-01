package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016129 Expansion of 1/((1-2x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A016129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016129() {
    super(new long[] {-12, 8}, new long[] {1, 8});
  }
}
