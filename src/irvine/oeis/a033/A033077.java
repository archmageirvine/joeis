package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033077 Numbers n with property that all pairs of consecutive base 6 digits differ by 3.
 * @author Sean A. Irvine
 */
public class A033077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033077() {
    super(new long[] {-6, 0, 0, 0, 0, 1, 0, 0, 0, 0, 6, 0, 0, 0, 0}, new long[] {1, 2, 3, 4, 5, 10, 17, 18, 25, 32, 61, 104, 111, 154, 197});
  }
}
