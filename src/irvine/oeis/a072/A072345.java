package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072345.
 * @author Sean A. Irvine
 */
public class A072345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072345() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 1, 4});
  }
}
