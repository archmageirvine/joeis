package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245467.
 * @author Sean A. Irvine
 */
public class A245467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245467() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 0, 1, 2, 3, 7});
  }
}
