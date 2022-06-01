package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078369 A Chebyshev T-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078369() {
    super(new long[] {-1, 19}, new long[] {2, 19});
  }
}
