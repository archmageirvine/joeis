package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274340 A 4-cycle of the iterated sum of deficient divisors function.
 * @author Sean A. Irvine
 */
public class A274340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274340() {
    super(new long[] {1, 0, 0, 0}, new long[] {19, 20, 22, 36});
  }
}
