package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007209 Number of partitions of n into parts of sizes {a( )} is a(n).
 * @author Sean A. Irvine
 */
public class A007209 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mDen = RING.oneMinusXToTheN(1);

  @Override
  public Z next() {
    final Z c;
    switch (++mN) {
      case 0:
      case 1:
        return Z.ONE;
      case 2:
        return Z.TWO;
      case 3:
        c = Z.TWO;
        break;
      case 4:
        c = Z.FOUR;
        break;
      case 5:
        c = Z.FIVE;
        break;
      default:
        c = RING.coeff(RING.one(), mDen, mN);
        break;
    }
    mDen = RING.multiply(mDen, RING.oneMinusXToTheN(c.intValueExact()));
    return c;
  }
}

