package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083079 4th column of number array A083075.
 * @author Sean A. Irvine
 */
public class A083079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083079() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 63, 229, 547});
  }
}
