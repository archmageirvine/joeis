package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256873 a(n) = 2^(n-1)*(2^n+5).
 * @author Sean A. Irvine
 */
public class A256873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256873() {
    super(new long[] {-8, 6}, new long[] {3, 7});
  }
}
