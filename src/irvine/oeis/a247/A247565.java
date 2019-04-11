package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247565 <code>a(n) = 5*a(n-1) - 10*a(n-2) + 8*a(n-3)</code> with <code>a(0) = 2, a(1) = a(2) = 3</code>.
 * @author Sean A. Irvine
 */
public class A247565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247565() {
    super(new long[] {8, -10, 5}, new long[] {2, 3, 3});
  }
}
