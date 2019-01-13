package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083416.
 * @author Sean A. Irvine
 */
public class A083416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083416() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 4, 5});
  }
}
