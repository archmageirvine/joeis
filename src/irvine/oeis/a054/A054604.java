package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054604 <code>a(n) =</code> Sum_{d|5} phi(d)*n^(5/d).
 * @author Sean A. Irvine
 */
public class A054604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054604() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 5, 40, 255, 1040, 3145});
  }
}
