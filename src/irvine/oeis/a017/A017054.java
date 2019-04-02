package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017054 a(n) = (7*n + 6)^2.
 * @author Sean A. Irvine
 */
public class A017054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017054() {
    super(new long[] {1, -3, 3}, new long[] {36, 169, 400});
  }
}
