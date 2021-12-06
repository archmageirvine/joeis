package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022984 a(n) = 28-n.
 * @author Sean A. Irvine
 */
public class A022984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022984() {
    super(new long[] {-1, 2}, new long[] {28, 27});
  }
}
