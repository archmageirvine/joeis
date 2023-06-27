package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158250 a(n) = 256*n - 1.
 * @author Sean A. Irvine
 */
public class A158250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158250() {
    super(1, new long[] {-1, 2}, new long[] {255, 511});
  }
}
