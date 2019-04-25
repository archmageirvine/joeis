package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005708 <code>a(n) = a(n-1) + a(n-6),</code> with <code>a(i) = 1</code> for <code>i = 0..5</code>.
 * @author Sean A. Irvine
 */
public class A005708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005708() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1});
  }
}

