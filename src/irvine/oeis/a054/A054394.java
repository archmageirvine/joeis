package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a001.A001006;

/**
 * A054394 Number of permutations with certain forbidden subsequences.
 * @author Sean A. Irvine
 */
public class A054394 extends A001006 implements Conjectural {


  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -3, 3, -3, 2, -1);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, -2, 1, -1);
  private final Polynomial<Z> mA = RING.empty();
  {
    mA.add(Z.ZERO);
  }
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mA.add(super.next());
    return RING.substitute(RING.series(NUM, DEN, mN), mA, mN).coeff(mN);
  }
}
