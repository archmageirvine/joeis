package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135032 a(n) = 6*a(n-1) + 4*a(n-2).
 * @author Sean A. Irvine
 */
public class A135032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135032() {
    super(new long[] {4, 6}, new long[] {0, 1});
  }
}
