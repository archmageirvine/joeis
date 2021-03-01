package irvine.oeis.a039;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039924 G.f.: Sum_{k&gt;=0} x^(k^2)*(-1)^k/(Product_{i=1..k} 1-x^i).
 * @author Sean A. Irvine
 */
public class A039924 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    Polynomial<Z> sum = RING.one();
    for (int k = 1; k <= IntegerUtils.sqrt(mN); ++k) {
      // Construct x^k-1
      final Z[] t = new Z[k + 1];
      Arrays.fill(t, Z.ZERO);
      t[0] = Z.NEG_ONE;
      t[k] = Z.ONE;
      // Update product
      prod = RING.multiply(prod, Polynomial.create(t), mN);
      // Update sum
      sum = RING.add(sum, RING.series(RING.monomial(Z.ONE, k * k), prod, mN));
    }
    return sum.coeff(mN);
  }
}
