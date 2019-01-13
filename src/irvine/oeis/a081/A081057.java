package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081057.
 * @author Sean A. Irvine
 */
public class A081057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081057() {
    super(new long[] {-4, 2, 3}, new long[] {1, 2, 6});
  }
}
