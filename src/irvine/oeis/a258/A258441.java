package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258441 9-gonal numbers (A001106) that are the sum of two consecutive 9-gonal numbers.
 * @author Sean A. Irvine
 */
public class A258441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258441() {
    super(1, new long[] {1, -39203, 39203}, new long[] {24486, 959892121, 37629690894906L});
  }
}
