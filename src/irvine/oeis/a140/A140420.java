package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140420 Binomial transform of <code>0, 1, 1, 7, 7, 31, 31, ...,</code> zero followed by duplicated A083420.
 * @author Sean A. Irvine
 */
public class A140420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140420() {
    super(new long[] {6, -5, -5, 5}, new long[] {0, 1, 3, 13});
  }
}
