package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000517 Number of permutations of length n with exactly three valleys.
 * @author Sean A. Irvine
 */
public class A000517 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(272, -2944, 10176, -11520);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -40, 700, -7056, 45360, -194304, 561728, -1082624, 1332224, -946176, 294912);

  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
