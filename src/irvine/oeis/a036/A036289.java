package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036289 a(n) = n*2^n.
 * @author Sean A. Irvine
 */
public class A036289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036289() {
    super(new long[] {-4, 4}, new long[] {0, 2});
  }
}
