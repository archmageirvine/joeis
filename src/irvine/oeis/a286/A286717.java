package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286717 <code>a(n)</code> is the number of zeros of the Chebyshev <code>S(n, x)</code> polynomial <code>(A049310)</code> in the open interval <code>(-phi, +phi)</code>, with the golden section phi <code>= (1 + sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A286717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286717() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 2, 3});
  }
}
