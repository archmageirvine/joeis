package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087800 a(n) = 12*a(n-1) - a(n-2), with a(0) = 2 and a(1) = 12.
 * @author Sean A. Irvine
 */
public class A087800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087800() {
    super(new long[] {-1, 12}, new long[] {2, 12});
  }
}
