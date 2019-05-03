package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145071 Partial sums of <code>A000051</code>, starting at <code>n=1</code>.
 * @author Sean A. Irvine
 */
public class A145071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145071() {
    super(new long[] {2, -5, 4}, new long[] {3, 8, 17});
  }
}
