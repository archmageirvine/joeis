package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177206 <code>a(n) =</code> 2*binomial(n+4, <code>4) + n + 4</code>.
 * @author Sean A. Irvine
 */
public class A177206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177206() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 15, 36, 77, 148});
  }
}
