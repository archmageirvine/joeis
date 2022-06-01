package irvine.oeis.a243;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A243399 a(0) = 1, a(1) = 19; for n &gt; 1, a(n) = 19*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A243399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243399() {
    super(new long[] {1, 19}, new long[] {1, 19});
  }
}
