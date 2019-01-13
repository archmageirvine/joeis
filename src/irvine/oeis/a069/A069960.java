package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069960.
 * @author Sean A. Irvine
 */
public class A069960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069960() {
    super(new long[] {-1, 2, 2}, new long[] {1, 10, 13});
  }
}
