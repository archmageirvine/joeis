package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069099.
 * @author Sean A. Irvine
 */
public class A069099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069099() {
    super(new long[] {1, -3, 3}, new long[] {1, 8, 22});
  }
}
