package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020526 <code>a(n) =</code> 6th Euler polynomial evaluated at <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A020526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020526() {
    super(new long[] {-32768, 22016, -3024, 106}, new long[] {0, 2, 1332, 166376});
  }
}
