package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286062.
 * @author Sean A. Irvine
 */
public class A286062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286062() {
    super(new long[] {-1, 1, 2}, new long[] {2, 3, 6});
  }
}
