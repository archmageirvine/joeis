package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017594 a(n) = (12*n + 6)^2.
 * @author Sean A. Irvine
 */
public class A017594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017594() {
    super(new long[] {1, -3, 3}, new long[] {36, 324, 900});
  }
}
