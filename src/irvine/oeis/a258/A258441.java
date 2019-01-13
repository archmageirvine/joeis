package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258441.
 * @author Sean A. Irvine
 */
public class A258441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258441() {
    super(new long[] {1, -39203, 39203}, new long[] {24486, 959892121, 37629690894906L});
  }
}
