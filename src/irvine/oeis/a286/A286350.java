package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286350.
 * @author Sean A. Irvine
 */
public class A286350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286350() {
    super(new long[] {1, 0, -1, 2}, new long[] {0, 2, 2, 3});
  }
}
