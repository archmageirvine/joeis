package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195623 Numerators of Pythagorean approximations to 5.
 * @author Sean A. Irvine
 */
public class A195623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195623() {
    super(new long[] {-1, 101, 101}, new long[] {99, 10101, 1030199});
  }
}
