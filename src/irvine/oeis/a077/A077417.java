package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077417 Chebyshev T-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077417() {
    super(new long[] {-1, 12}, new long[] {1, 11});
  }
}
