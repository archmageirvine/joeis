package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158369.
 * @author Sean A. Irvine
 */
public class A158369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158369() {
    super(new long[] {1, -3, 3}, new long[] {578, 2308, 5190});
  }
}
