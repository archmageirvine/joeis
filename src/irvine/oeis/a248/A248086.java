package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248086 Sum of the eccentricities of all vertices in the Lucas cube Lambda(n).
 * @author Sean A. Irvine
 */
public class A248086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248086() {
    super(new long[] {1, 3, 0, -6, -2, 4, 1}, new long[] {0, 0, 5, 7, 22, 37, 81});
  }
}
