package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051744.
 * @author Sean A. Irvine
 */
public class A051744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051744() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 8, 21, 45, 85});
  }
}
