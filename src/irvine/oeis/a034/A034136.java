package irvine.oeis.a034;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;

/**
 * A034136 Number of partitions of n into distinct parts from <code>[ 1, 6 ]</code>.
 * @author Sean A. Irvine
 */
public class A034136 extends PrependSequence {

  private static Z[] expand(final int n) {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    Polynomial<Z> prod = ring.one();
    for (int k = 1; k <= n; ++k) {
      prod = ring.multiply(prod, ring.onePlusXToTheN(k));
    }
    return prod.toArray(new Z[0]);
  }

  protected A034136(final int n) {
    super(new A000004(), expand(n));
  }

  /** Construct the sequence. */
  public A034136() {
    this(6);
  }
}

