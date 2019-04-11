package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144619 <code>a(n) = 19n + 8</code>.
 * @author Sean A. Irvine
 */
public class A144619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144619() {
    super(new long[] {-1, 2}, new long[] {8, 27});
  }
}
