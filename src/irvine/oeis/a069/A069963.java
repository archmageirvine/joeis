package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069963.
 * @author Sean A. Irvine
 */
public class A069963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069963() {
    super(new long[] {-1, 2, 2}, new long[] {1, 37, 40});
  }
}
