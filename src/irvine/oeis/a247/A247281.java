package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247281 <code>4^n -(-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A247281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247281() {
    super(new long[] {4, 3}, new long[] {0, 5});
  }
}
