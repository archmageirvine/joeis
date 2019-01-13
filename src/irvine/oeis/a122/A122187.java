package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122187.
 * @author Sean A. Irvine
 */
public class A122187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122187() {
    super(new long[] {-1, 4, 11}, new long[] {1, 14, 157});
  }
}
