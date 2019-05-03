package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088581 <code>a(n) = n*x^n + (n-1)*x^(n-1) +</code> . . . <code>+ x + 1</code> for <code>x=3</code>.
 * @author Sean A. Irvine
 */
public class A088581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088581() {
    super(new long[] {9, -15, 7}, new long[] {1, 4, 22});
  }
}
