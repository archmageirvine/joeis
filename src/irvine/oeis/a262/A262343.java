package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262343 Numerator of <code>3*(1-2/n),</code> for <code>n &gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A262343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262343() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {1, 3, 9, 2, 15, 9, 7, 12, 27, 5, 33, 18});
  }
}
