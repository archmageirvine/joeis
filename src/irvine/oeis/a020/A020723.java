package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020723 <code>n+9</code>.
 * @author Sean A. Irvine
 */
public class A020723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020723() {
    super(new long[] {-1, 2}, new long[] {9, 10});
  }
}
