package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247281 a(n) = 4^n -(-1)^n.
 * @author Sean A. Irvine
 */
public class A247281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247281() {
    super(new long[] {4, 3}, new long[] {0, 5});
  }
}
