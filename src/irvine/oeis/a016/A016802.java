package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016802 a(n) = (4*n)^2.
 * @author Sean A. Irvine
 */
public class A016802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016802() {
    super(new long[] {1, -3, 3}, new long[] {0, 16, 64});
  }
}
