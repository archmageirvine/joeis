package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156773.
 * @author Sean A. Irvine
 */
public class A156773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156773() {
    super(new long[] {1, -3, 3}, new long[] {3482, 485, 10610});
  }
}
