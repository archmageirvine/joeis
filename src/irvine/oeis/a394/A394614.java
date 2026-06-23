package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394614 Irregular triangle read by rows: T(n,k) is the number of rooted binary time-consistent leaf-labeled unlabeled galled trees with n leaves and exactly k galls, 0 &lt;= k &lt;= floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A394614 extends Sequence0 {

  private static final Polynomial<Q> HALF = Polynomial.create(Q.HALF);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Polynomial<Q>> mA = new PolynomialRingField<>(new PolynomialRingField<>(Rationals.SINGLETON)).zero();

  @Override
  public Z next() {
    if (2 * ++mM >= mN) {
      mM = 0;
      final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, ++mN / 2);
      final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
      mA = ring.add(
        ring.x(),
        ring.multiply(ring.multiply(mA, mA, mN), HALF),
        ring.multiply(ring.multiply(PolynomialUtils.innerShift(ring, mA, 1), ring.pow(ring.series(mA, ring.subtract(ring.one(), mA), mN), 2, mN), mN), HALF)
      );
      //System.out.println(mA);
    }
    return mA.coeff(mN).coeff(mM).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
