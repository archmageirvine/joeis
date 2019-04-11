package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020527 2nd Bernoulli polynomial evaluated at powers of 2 (multiplied by <code>6)</code>.
 * @author Sean A. Irvine
 */
public class A020527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020527() {
    super(new long[] {8, -14, 7}, new long[] {1, 13, 73});
  }
}
