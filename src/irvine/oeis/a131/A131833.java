package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131833.
 * @author Sean A. Irvine
 */
public class A131833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131833() {
    super(new long[] {2, -5, 4}, new long[] {1, 6, 13});
  }
}
