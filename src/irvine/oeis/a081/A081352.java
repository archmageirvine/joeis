package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081352 Main diagonal of square maze arrangement of natural numbers <code>A081349</code>.
 * @author Sean A. Irvine
 */
public class A081352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081352() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 7, 11, 21});
  }
}
