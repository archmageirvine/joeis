package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167032 <code>a(n) = 20*a(n-1) - 64*a(n-2) + 2</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 21</code>.
 * @author Sean A. Irvine
 */
public class A167032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167032() {
    super(new long[] {64, -84, 21}, new long[] {1, 21, 358});
  }
}
