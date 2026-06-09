package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.a006.A006899;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085238 Sort the numbers 2^i and 3^j. Then a(n) is the exponent of the n-th term.
 * @author Sean A. Irvine
 */
public class A085238 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085238() {
    super(1, new A006899(), n -> Functions.VALUATION.z(n, n.isOdd() ? 3 : 2));
  }
}
