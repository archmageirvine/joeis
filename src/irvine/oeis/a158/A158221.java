package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158221 a(n) = 169n + 1.
 * @author Sean A. Irvine
 */
public class A158221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158221() {
    super(1, new long[] {-1, 2}, new long[] {170, 339});
  }
}
