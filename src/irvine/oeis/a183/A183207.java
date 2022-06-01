package irvine.oeis.a183;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A183207 Termwise products of the natural numbers and odd integers repeated.
 * @author Sean A. Irvine
 */
public class A183207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183207() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 9, 12, 25});
  }
}
