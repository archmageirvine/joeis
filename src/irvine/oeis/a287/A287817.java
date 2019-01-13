package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287817.
 * @author Sean A. Irvine
 */
public class A287817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287817() {
    super(new long[] {1, 10, -23, -1, 8}, new long[] {1, 9, 67, 501, 3747});
  }
}
