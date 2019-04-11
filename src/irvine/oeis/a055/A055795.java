package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055795 <code>a(n) =</code> binomial(n,4) + binomial(n,2).
 * @author Sean A. Irvine
 */
public class A055795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055795() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 3, 7, 15});
  }
}
