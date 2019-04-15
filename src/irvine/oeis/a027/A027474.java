package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027474 <code>a(n) = 7^(n-2) * C(n,2)</code>.
 * @author Sean A. Irvine
 */
public class A027474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027474() {
    super(new long[] {343, -147, 21}, new long[] {1, 21, 294});
  }
}
