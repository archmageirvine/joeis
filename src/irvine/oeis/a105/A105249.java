package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105249 <code>a(n) =</code> binomial(n+2,n)*binomial(n+6,n).
 * @author Sean A. Irvine
 */
public class A105249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105249() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 21, 168, 840, 3150, 9702, 25872, 61776, 135135});
  }
}
