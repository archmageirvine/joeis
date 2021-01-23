package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017270 a(n) = (10*n)^2.
 * @author Sean A. Irvine
 */
public class A017270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017270() {
    super(new long[] {1, -3, 3}, new long[] {0, 100, 400});
  }
}
