package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102860 Number of ways to change three non-identical letters in the word aabbccdd..., where there are n types of letters.
 * @author Sean A. Irvine
 */
public class A102860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102860() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 16, 64, 160});
  }
}
