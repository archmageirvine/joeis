package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097841 First differences of Chebyshev polynomials <code>S(n,83) =</code> A097839(n) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097841() {
    super(new long[] {-1, 83}, new long[] {1, 82});
  }
}
