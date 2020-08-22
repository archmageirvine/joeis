package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213173 a(n) = 4^floor(n/2), Powers of 4 repeated.
 * @author Sean A. Irvine
 */
public class A213173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213173() {
    super(new long[] {4, 0}, new long[] {1, 1});
  }
}
