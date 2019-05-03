package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088578 <code>a(n) = n*x^n + (n-1)*x^(n-1) +</code> . . . <code>+ x + 1</code> for <code>x=2</code>.
 * @author Sean A. Irvine
 */
public class A088578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088578() {
    super(new long[] {4, -8, 5}, new long[] {1, 3, 11});
  }
}
