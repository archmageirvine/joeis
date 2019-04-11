package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020970 Expansion of <code>1/((1-7*x)*(1-9*x)*(1-10*x))</code>.
 * @author Sean A. Irvine
 */
public class A020970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020970() {
    super(new long[] {630, -223, 26}, new long[] {1, 26, 453});
  }
}
