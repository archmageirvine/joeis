package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021268.
 * @author Sean A. Irvine
 */
public class A021268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021268() {
    super(new long[] {-160, 276, -136, 21}, new long[] {1, 21, 305, 3825});
  }
}
