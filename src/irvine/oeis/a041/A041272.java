package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041272 Numerators of continued fraction convergents to <code>sqrt(149)</code>.
 * @author Sean A. Irvine
 */
public class A041272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041272() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 227164, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {12, 49, 61, 354, 1123, 3723, 19738, 23461, 113582, 2749429, 11111298, 13860727, 80414933, 255105526, 845731511, 4483763081L, 5329494592L, 25801741449L});
  }
}
