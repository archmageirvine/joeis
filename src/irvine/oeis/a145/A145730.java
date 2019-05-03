package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145730 Partial sums of <code>A108019</code>.
 * @author Sean A. Irvine
 */
public class A145730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145730() {
    super(new long[] {8, -17, 10}, new long[] {0, 4, 40});
  }
}
