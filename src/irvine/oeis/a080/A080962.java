package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080962 5th binomial transform of the periodic sequence (1,6,1,1,6,1...).
 * @author Sean A. Irvine
 */
public class A080962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080962() {
    super(new long[] {-24, 10}, new long[] {1, 11});
  }
}
