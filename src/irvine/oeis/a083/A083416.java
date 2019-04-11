package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083416 Add 1, double, add 1, double, etc.
 * @author Sean A. Irvine
 */
public class A083416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083416() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 4, 5});
  }
}
