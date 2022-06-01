package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165806 a(n) = 15n^2 + 3n + 1.
 * @author Sean A. Irvine
 */
public class A165806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165806() {
    super(new long[] {1, -3, 3}, new long[] {19, 67, 145});
  }
}
