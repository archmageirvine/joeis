package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006172 <code>a(n) = 1 + F(2*n+1) +</code> (-1)^n*L(n).
 * @author Sean A. Irvine
 */
public class A006172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006172() {
    super(new long[] {-1, 5, -7, 1, 3}, new long[] {4, 2, 9, 10, 42});
  }
}
