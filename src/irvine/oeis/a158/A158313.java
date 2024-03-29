package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158313 a(n) = 400 * n + 1.
 * @author Sean A. Irvine
 */
public class A158313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158313() {
    super(1, new long[] {-1, 2}, new long[] {401, 801});
  }
}
