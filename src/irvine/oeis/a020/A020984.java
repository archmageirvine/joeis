package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020984 Expansion of <code>1/((1-9*x)*(1-11*x)*(1-12*x))</code>.
 * @author Sean A. Irvine
 */
public class A020984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020984() {
    super(new long[] {1188, -339, 32}, new long[] {1, 32, 685});
  }
}
