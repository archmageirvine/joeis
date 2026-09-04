package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000663 Number of binary relations on an infinite set, each with exactly n ordered pairs, up to isomorphism.
 * @author Sean A. Irvine
 */
public class A000663 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final int s = Math.max(2 * ++mN, 1);
    final IntegerPartition part = new IntegerPartition(s);
    int[] p;
    final int[] c = new int[s + 1];
    Polynomial<Q> total = RING.zero();
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      Polynomial<Q> prodNum = RING.one();
      for (int i = 1; i < c.length; ++i) {
        if (c[i] != 0) {
          for (int j = 1; j < c.length; ++j) {
            if (c[j] != 0) {
              prodNum = RING.multiply(prodNum, RING.pow(RING.onePlusXToTheN(Functions.LCM.i(i, j)), Functions.GCD.l(i, j) * c[i] * c[j], mN), mN);
            }
          }
        }
      }
      Z prodDen = Z.ONE;
      for (int k = 1; k < c.length; ++k) {
        if (c[k] != 0) {
          prodDen = prodDen.multiply(Z.valueOf(k).pow(c[k]).multiply(Functions.FACTORIAL.z(c[k])));
        }
      }
      total = RING.add(total, RING.divide(prodNum, Q.valueOf(prodDen)));
    }
    return total.coeff(mN).toZ();
  }
}

