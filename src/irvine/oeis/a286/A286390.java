package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286390.
 * @author Sean A. Irvine
 */
public class A286390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286390() {
    super(new long[] {1, -2, 1, 0}, new long[] {0, 2, -1, 3});
  }
}
