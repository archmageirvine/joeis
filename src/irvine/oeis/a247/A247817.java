package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247817 Sum(4^k, <code>k=2..n)</code>.
 * @author Sean A. Irvine
 */
public class A247817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247817() {
    super(new long[] {-4, 5}, new long[] {0, 16});
  }
}
