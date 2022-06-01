package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165721 Integers of the form k*(k+13)/12.
 * @author Sean A. Irvine
 */
public class A165721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165721() {
    super(new long[] {1, -3, 5, -7, 7, -5, 3}, new long[] {4, 14, 22, 25, 35, 55, 69});
  }
}
