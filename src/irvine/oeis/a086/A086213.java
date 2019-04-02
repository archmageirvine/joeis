package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086213 Tribonacci numbers that start with first three cubes.
 * @author Sean A. Irvine
 */
public class A086213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086213() {
    super(new long[] {1, 1, 1}, new long[] {1, 8, 27});
  }
}
