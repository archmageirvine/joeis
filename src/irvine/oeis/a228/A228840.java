package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228840 a(n) = 3^n*A228569(n).
 * @author Sean A. Irvine
 */
public class A228840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228840() {
    super(new long[] {-27, 15}, new long[] {2, 15});
  }
}
