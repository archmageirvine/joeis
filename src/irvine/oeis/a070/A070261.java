package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070261 4th diagonal of triangle defined in <code>A051537</code>.
 * @author Sean A. Irvine
 */
public class A070261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070261() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {4, 10, 2, 28, 40, 6, 70, 88, 12});
  }
}
