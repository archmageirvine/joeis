package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076839 A simple example of the Lyness <code>5-cycle: a(1) = a(2) = 1; a(n) = (a(n-1)+1)/a(n-2)</code> (for <code>n&gt;2)</code>.
 * @author Sean A. Irvine
 */
public class A076839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076839() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 2});
  }
}
