package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286717 <code>a(n)</code> is the number of zeros of the Chebyshev S(n, <code>x)</code> polynomial (A049310) in the open interval (-phi, +phi), with the golden section phi <code>= (1 + sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A286717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286717() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 2, 3});
  }
}
