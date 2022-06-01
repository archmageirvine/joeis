package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167032 a(n) = 20*a(n-1) - 64*a(n-2) + 2 for n &gt; 1; a(0) = 1, a(1) = 21.
 * @author Sean A. Irvine
 */
public class A167032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167032() {
    super(new long[] {64, -84, 21}, new long[] {1, 21, 358});
  }
}
