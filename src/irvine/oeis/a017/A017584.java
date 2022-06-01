package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017584 (12n+5)^4.
 * @author Sean A. Irvine
 */
public class A017584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017584() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {625, 83521, 707281, 2825761, 7890481});
  }
}
