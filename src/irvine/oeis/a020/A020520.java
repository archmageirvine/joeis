package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020520 <code>12th</code> cyclotomic polynomial evaluated at powers of 2.
 * @author Sean A. Irvine
 */
public class A020520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020520() {
    super(new long[] {64, -84, 21}, new long[] {1, 13, 241});
  }
}
