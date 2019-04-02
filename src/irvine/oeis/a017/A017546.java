package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017546 (12n+2)^2.
 * @author Sean A. Irvine
 */
public class A017546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017546() {
    super(new long[] {1, -3, 3}, new long[] {4, 196, 676});
  }
}
