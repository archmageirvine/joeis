package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038390 Bisection of A028289.
 * @author Sean A. Irvine
 */
public class A038390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038390() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 2, 5, 11, 17, 27, 42, 57});
  }
}
