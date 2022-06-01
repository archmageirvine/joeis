package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017593 a(n) = 12*n + 6.
 * @author Sean A. Irvine
 */
public class A017593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017593() {
    super(new long[] {-1, 2}, new long[] {6, 18});
  }
}
