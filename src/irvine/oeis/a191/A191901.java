package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191901 Number of compositions of odd natural numbers into 6 parts <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A191901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191901() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {0, 32, 364, 2048, 7812, 23328, 58824, 131072});
  }
}
