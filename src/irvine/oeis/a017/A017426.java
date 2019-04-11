package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017426 <code>(11n+3)^2</code>.
 * @author Sean A. Irvine
 */
public class A017426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017426() {
    super(new long[] {1, -3, 3}, new long[] {9, 196, 625});
  }
}
