package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145766 Partial sums of <code>A020988</code>.
 * @author Sean A. Irvine
 */
public class A145766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145766() {
    super(new long[] {4, -9, 6}, new long[] {0, 2, 12});
  }
}
