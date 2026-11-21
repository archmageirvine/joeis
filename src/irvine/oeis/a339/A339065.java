package irvine.oeis.a339;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A339065 Number of unlabeled loopless multigraphs with n edges rooted at two noninterchangeable vertices.
 * @author Gregory Morse
 */
public class A339065 extends A339063 {
  protected A339065(final boolean ordered) {
    super(ordered);
  }

  /** Construct the sequence. */
  public A339065() {
    this(true);
  }

  @Override
  protected Polynomial<Z> edgeOrbit(final int size, final int degreeLimit) {
    return RING.series(RING.one(), RING.oneMinusXToTheN(Z.ONE, size), degreeLimit);
  }
}
