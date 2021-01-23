package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138749 a(n) = 2*a(n-1) - 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A138749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138749() {
    super(new long[] {-5, 2}, new long[] {-1, -7});
  }
}
