package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083694 a(n)= 2*A002532(n).
 * @author Sean A. Irvine
 */
public class A083694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083694() {
    super(new long[] {5, 2}, new long[] {0, 2});
  }
}
