package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088582 <code>a(n) = n*x^n + (n-1)*x^(n-1) + </code>. . . <code>+ x + 1</code> for <code>x=4</code>.
 * @author Sean A. Irvine
 */
public class A088582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088582() {
    super(new long[] {16, -24, 9}, new long[] {1, 5, 37});
  }
}
