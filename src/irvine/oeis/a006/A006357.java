package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006357.
 * @author Sean A. Irvine
 */
public class A006357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006357() {
    super(new long[] {-1, -1, 3, 2}, new long[] {1, 4, 10, 30});
  }
}

