package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129109 Sums of three consecutive hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A129109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129109() {
    super(new long[] {1, -3, 3}, new long[] {7, 22, 49});
  }
}
