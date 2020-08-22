package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102345 a(n) = 3^n + (-1)^n.
 * @author Sean A. Irvine
 */
public class A102345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102345() {
    super(new long[] {3, 2}, new long[] {2, 2});
  }
}
