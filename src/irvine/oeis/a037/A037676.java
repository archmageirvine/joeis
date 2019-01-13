package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037676.
 * @author Sean A. Irvine
 */
public class A037676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037676() {
    super(new long[] {-6, 7, -7, 7}, new long[] {1, 6, 38, 231});
  }
}
