package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198692 a(n) = 11*7^n-1.
 * @author Sean A. Irvine
 */
public class A198692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198692() {
    super(new long[] {-7, 8}, new long[] {10, 76});
  }
}
