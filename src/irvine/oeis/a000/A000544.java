package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000544 Number of permutations of length n by rises.
 * @author Sean A. Irvine
 */
public class A000544 extends AbstractSequence {

  /** Construct the sequence. */
  public A000544() {
    super(4);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -2, -1, 4, -1, -2, 1);
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    // Compute -x(x-1)/(x+1) = x-2x^2+2x^3-2x^4+2x^5-2x^6...
    final long[] in = new long[mN + 1];
    in[1] = 1;
    for (int k = 2; k < in.length; ++k) {
      in[k] = (k & 1) == 0 ? -2 : 2;
    }
    final Polynomial<Z> inside = Polynomial.create(in);
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Z> t = RING.multiply(RING.multiply(RING.pow(inside, k, mN),
        Functions.FACTORIAL.z(k).multiply(k)),
        Polynomial.create(k - 1, -1, 1), mN);
      sum = RING.add(sum, t);
    }
    return RING.coeff(sum, DEN, mN);
  }
}
