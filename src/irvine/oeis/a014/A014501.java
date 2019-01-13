package irvine.oeis.a014;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014501.
 * @author Sean A. Irvine
 */
public class A014501 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.NEG_ONE, Q.HALF));
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    Polynomial<Q> sum = RING.zero();
    Z f = Z.ONE;
    for (int k = 0; k <= 3 * mN; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      sum = RING.add(sum, RING.multiply(RING.pow(RING.onePlusXToTheN(1), k * (k + 1) / 2, 2 * mN), new Q(Z.ONE, f)));
    }
    final Polynomial<Q> egf = RING.multiply(sum, RING.exp(A, 2 * mN), mN);
    //System.out.println(egf);
    return egf.coeff(mN).multiply(mF).add(Q.HALF).toZ();
  }
}
