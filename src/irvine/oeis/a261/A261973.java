package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261973 The first of three consecutive positive integers the sum of the squares of which is equal to the sum of the squares of eleven consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A261973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261973() {
    super(new long[] {1, -47, 47}, new long[] {137, 6341, 291593});
  }
}
