package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003696.
 * @author Sean A. Irvine
 */
public class A003696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003696() {
    super(new long[] {-1, 56, -672, 2632, -4094, 2632, -672, 56},
      new long[] {1, 56, 2415, 100352, 4140081, 170537640, 7022359583L, 289143013376L});
  }
}
