package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178936 <code>Floor((2*3^n+3*2^n)/5)</code>.
 * @author Sean A. Irvine
 */
public class A178936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178936() {
    super(new long[] {6, -5, 1, 0, -6, 5}, new long[] {1, 2, 6, 15, 42, 116});
  }
}
