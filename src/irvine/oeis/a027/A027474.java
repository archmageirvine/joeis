package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027474 a(n) = 7^(n-2) * C(n,2).
 * @author Sean A. Irvine
 */
public class A027474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027474() {
    super(new long[] {343, -147, 21}, new long[] {1, 21, 294});
  }
}
