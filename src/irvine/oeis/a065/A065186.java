package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065186.
 * @author Sean A. Irvine
 */
public class A065186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065186() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 3, 5, 2, 4, 6});
  }
}
