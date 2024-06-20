package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068182 Number of combinatorially non-equivalent "triangulations" of a compact genus n surface which have only 1 vertex (all vertices of the triangles are identified). Also the number of combinatorially distinct identifications of pairs of edges of a polygon P having 12g-6 sides leading to a compact oriented genus g surface containing the boundary of P as a 3-regular graph.
 * @author Sean A. Irvine
 */
public class A068182 extends Sequence0 {

  // Formula (4) of Evgeniy Krasko, Igor Labutin, and Alexander Omelchenko

  private static final Z Z12 = Z.valueOf(12);
  private int mN = 0;

  private Z tauPlus3(final int g) {
    return Functions.FACTORIAL.z(6 * g - 3).multiply2()
      .divide(Functions.FACTORIAL.z(g))
      .divide(Functions.FACTORIAL.z(3 * g - 2))
      .divide(Z12.pow(g));
  }

  private Q pow3(final int g) {
    return g >= 0 ? new Q(Z.THREE.pow(g)) : new Q(Z.THREE.pow(-g)).reciprocal();
  }

  private Q innerSum(final int k) {
    final Z a = Z.TWO.pow(2L * mN - 1 - 3L * k).add(Z.NEG_ONE.pow(k));
    return Rationals.SINGLETON.sum(0, k - mN / 2,
      g -> new Q(
        a.multiply(Functions.FACTORIAL.z(2 * k - 2 * g)),
        Functions.FACTORIAL.z(g)
          .multiply(Functions.FACTORIAL.z(k - g))
          .multiply(Functions.FACTORIAL.z(4 * k + 3 - 2 * mN - 4 * g))
      ).multiply(pow3(g - 2)).divide(Functions.FACTORIAL.z(2 * mN - 1 - 3 * k)));
  }

  private Q pow34(final int g) {
    return g >= 0 ? new Q(Z.THREE.pow(g), Z.ONE.shiftLeft(2L * g)) : new Q(Z.ONE.shiftLeft(2L * -g), Z.THREE.pow(-g));
  }

  private Q sum1(final int n) {
    return Rationals.SINGLETON.sum(0, n / 2,
      g -> new Q(
        Functions.FACTORIAL.z(4 * n - 2 - 2 * g),
        Functions.FACTORIAL.z(g)
          .multiply(Functions.FACTORIAL.z(2 * n - 1 - g))
          .multiply(Functions.FACTORIAL.z(2 * n - 4 * g + 1))
          .multiply(Z.THREE.pow(g))
          .multiply2()));
  }

  private Q sum2(final int n) {
    return Rationals.SINGLETON.sum(0, (n + 1) / 3,
        g -> new Q(
          Z.TWO.pow(n + 1 - 3L * g).add(Z.NEG_ONE.pow(n - g)),
          Functions.FACTORIAL.z(g).multiply(Functions.FACTORIAL.z(n + 1 - 3 * g))).multiply(pow34(g - 1)))
      .multiply(new Q(Functions.FACTORIAL.z(2 * n - 2), Functions.FACTORIAL.z(n - 1).multiply(6)));
  }

  @Override
  public Z next() {
    return new Q(tauPlus3(++mN), Z.valueOf(6L * mN - 3).multiply2())
      .add(sum1(mN))
      .add(sum2(mN))
      .add(Rationals.SINGLETON.sum(mN / 2, (2 * mN - 2) / 3, this::innerSum))
      .toZ();
  }
}
