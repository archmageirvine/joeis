package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005709 <code>a(n) = a(n-1) + a(n-7)</code>, with <code>a(i) = 1</code> for <code>i = 0..6</code>.
 * @author Sean A. Irvine
 */
public class A005709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005709() {
    super(new long[] {1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}

