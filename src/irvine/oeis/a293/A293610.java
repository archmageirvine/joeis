package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293610 <code>a(n) = (15*n^2 + 35*n +</code> 16)*Pochhammer(n, <code>5) / 6!</code>.
 * @author Sean A. Irvine
 */
public class A293610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293610() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 11, 146, 896, 3696, 11886, 32172, 76692});
  }
}
