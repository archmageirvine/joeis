package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102865.
 * @author Sean A. Irvine
 */
public class A102865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102865() {
    super(new long[] {-4, 1, 4}, new long[] {1, 3, 9});
  }
}
