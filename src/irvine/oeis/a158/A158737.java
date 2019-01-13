package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158737.
 * @author Sean A. Irvine
 */
public class A158737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158737() {
    super(new long[] {1, -3, 3}, new long[] {1260, 5148, 11628});
  }
}
