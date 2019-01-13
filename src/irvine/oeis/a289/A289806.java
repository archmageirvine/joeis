package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289806.
 * @author Sean A. Irvine
 */
public class A289806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289806() {
    super(new long[] {-1, 2, 2, -5, 1, 3}, new long[] {1, 3, 9, 26, 74, 211});
  }
}
