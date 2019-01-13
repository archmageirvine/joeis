package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286717.
 * @author Sean A. Irvine
 */
public class A286717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286717() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 2, 3});
  }
}
