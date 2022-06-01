package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178348 a(n) = Sum_{k=0..n} 1100^k.
 * @author Sean A. Irvine
 */
public class A178348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178348() {
    super(new long[] {-1100, 1101}, new long[] {1, 1101});
  }
}
