package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076839 a(1) = a(2) = 1; a(n) = (a(n-1)+1)/a(n-2) (for n&gt;2).
 * @author Sean A. Irvine
 */
public class A076839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076839() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 2});
  }
}
