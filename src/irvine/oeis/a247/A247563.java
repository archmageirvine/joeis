package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247563 <code>a(n) = 3*a(n-1) - 4*a(n-2)</code> with <code>a(0) = 2, a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A247563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247563() {
    super(new long[] {-4, 3}, new long[] {2, 3});
  }
}
