package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006979 <code>a(n)</code> is the number of compositions of n in which the maximum part size is 5.
 * @author Sean A. Irvine
 */
public class A006979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006979() {
    super(new long[] {-1, -2, -3, -4, -3, -1, 0, 1, 2}, new long[] {0, 0, 0, 0, 0, 1, 2, 5, 12});
  }
}
