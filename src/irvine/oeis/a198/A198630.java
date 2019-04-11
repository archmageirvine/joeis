package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198630 Alternating sums of powers of <code>1,2,...,7</code>.
 * @author Sean A. Irvine
 */
public class A198630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198630() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {1, 4, 28, 208, 1540, 11344, 83188});
  }
}
