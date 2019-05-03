package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097838 First differences of Chebyshev polynomials <code>S(n,51) = A097836(n)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097838() {
    super(new long[] {-1, 51}, new long[] {1, 50});
  }
}
