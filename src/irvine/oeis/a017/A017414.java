package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017414 (11n+2)^2.
 * @author Sean A. Irvine
 */
public class A017414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017414() {
    super(new long[] {1, -3, 3}, new long[] {4, 169, 576});
  }
}
