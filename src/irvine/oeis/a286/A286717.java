package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286717 a(n) is the number of zeros of the Chebyshev S(n, x) polynomial (A049310) in the open interval (-phi, +phi), with the golden section phi = (1 + sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A286717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286717() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 2, 3});
  }
}
