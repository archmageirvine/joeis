package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037651.
 * @author Sean A. Irvine
 */
public class A037651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037651() {
    super(new long[] {-9, 1, 0, 9}, new long[] {3, 27, 244, 2199});
  }
}
