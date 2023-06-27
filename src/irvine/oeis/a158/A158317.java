package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158317 a(n) = 400*n - 1.
 * @author Sean A. Irvine
 */
public class A158317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158317() {
    super(1, new long[] {-1, 2}, new long[] {399, 799});
  }
}
