package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284647.
 * @author Sean A. Irvine
 */
public class A284647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284647() {
    super(new long[] {1, -11, 33, -33, 11}, new long[] {0, 1, 6, 36, 231});
  }
}
