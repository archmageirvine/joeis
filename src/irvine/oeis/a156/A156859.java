package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156859.
 * @author Sean A. Irvine
 */
public class A156859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156859() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 7, 14});
  }
}
