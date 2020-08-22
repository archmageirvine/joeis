package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257273 a(n) = 2^(n-1)*(2^n+3).
 * @author Sean A. Irvine
 */
public class A257273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257273() {
    super(new long[] {-8, 6}, new long[] {2, 5});
  }
}
