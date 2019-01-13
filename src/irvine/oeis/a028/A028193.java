package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028193.
 * @author Sean A. Irvine
 */
public class A028193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028193() {
    super(new long[] {-4400, 2270, -423, 34}, new long[] {1, 34, 733, 12810});
  }
}
