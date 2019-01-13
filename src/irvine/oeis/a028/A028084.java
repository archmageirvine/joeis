package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028084.
 * @author Sean A. Irvine
 */
public class A028084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028084() {
    super(new long[] {-1782, 1251, -297, 29}, new long[] {1, 29, 544, 8414});
  }
}
