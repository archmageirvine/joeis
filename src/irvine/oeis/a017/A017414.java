package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017414 <code>(11n+2)^2</code>.
 * @author Sean A. Irvine
 */
public class A017414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017414() {
    super(new long[] {1, -3, 3}, new long[] {4, 169, 576});
  }
}
