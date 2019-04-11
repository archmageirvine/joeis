package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022280 <code>a(n) = n*(23*n - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A022280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022280() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 45});
  }
}
