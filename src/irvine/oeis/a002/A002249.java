package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002249 <code>a(n) = a(n-1) - 2*a(n-2)</code> with <code>a(0) = 2, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A002249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002249() {
    super(new long[] {-2, 1}, new long[] {2, 1});
  }
}
