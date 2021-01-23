package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017246 a(n) = (9*n + 7)^2.
 * @author Sean A. Irvine
 */
public class A017246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017246() {
    super(new long[] {1, -3, 3}, new long[] {49, 256, 625});
  }
}
