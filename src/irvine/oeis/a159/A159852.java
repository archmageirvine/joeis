package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159852 <code>n^2 mod 60</code>.
 * @author Sean A. Irvine
 */
public class A159852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159852() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 16, 25, 36, 49, 4, 21, 40, 1, 24, 49, 16, 45, 16, 49, 24, 1, 40, 21, 4, 49, 36, 25, 16, 9, 4, 1});
  }
}
