package irvine.oeis.a070;

import irvine.math.z.InverseSigma;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A070957 Primes p such that the equation sigma(x) = p has no solution.
 * @author Sean A. Irvine
 */
public class A070957 extends FilterSequence {

  /** Construct the sequence. */
  public A070957() {
    super(1, new A000040(), p -> InverseSigma.countInverseSigma(p).isZero());
  }
}
