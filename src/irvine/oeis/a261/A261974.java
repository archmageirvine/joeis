package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261974 The first of eleven consecutive positive integers the sum of the squares of which is equal to the sum of the squares of three consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A261974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261974() {
    super(new long[] {1, -47, 47}, new long[] {67, 3307, 152275});
  }
}
