package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020529 4th Bernoulli polynomial evaluated at powers of 2 (multiplied by 30).
 * @author Sean A. Irvine
 */
public class A020529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020529() {
    super(new long[] {-512, 736, -252, 29}, new long[] {-1, 119, 4319, 94079});
  }
}
