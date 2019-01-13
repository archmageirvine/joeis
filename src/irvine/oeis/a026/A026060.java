package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026060.
 * @author Sean A. Irvine
 */
public class A026060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026060() {
    super(new long[] {-1, 4, -6, 4}, new long[] {45, 80, 126, 184});
  }
}
