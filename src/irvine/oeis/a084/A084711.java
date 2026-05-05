package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084711 -21*zeta_K(-1), where K runs through the simplest cubic fields.
 * @author Sean A. Irvine
 */
public class A084711 extends Sequence1 {

  private long mM = -2;

  private long nextM() {
    while (true) {
      ++mM;
      if (mM >= -1) {
        final long disc = mM * mM + 3 * mM + 9;
        if (Predicates.SQUARE_FREE.is(disc)) {
          return mM;
        }
      }
    }
  }

  private Z f(final long m, final long c, final long t) {
    // Cf. Eqn (54) of Kim and Kim (2002)
    final Z mm = Z.valueOf(m);
    final Z cc = Z.valueOf(c);
    final Z tt = Z.valueOf(t);

    final Z term1 = tt.square().add(cc.subtract(Z.ONE).multiply(tt)).multiply(mm.square());

    final Z term2 = tt.pow(3).multiply(-2)
      .add(tt.square().multiply(cc.multiply(-3).add(6)))
      .add(tt.multiply(cc.square().negate().add(cc.multiply(3))))
      .add(cc.square().negate().add(cc.multiply(3)).subtract(2))
      .multiply(mm);

    final Z term3 = tt.pow(3).multiply(-3)
      .add(tt.multiply(cc.square().multiply(3).subtract(cc.multiply(9)).add(9)))
      .add(cc.pow(3).subtract(cc.square().multiply(6)).add(cc.multiply(9)).subtract(3));

    return term1.add(term2).add(term3);
  }

  @Override
  public Z next() {
    final long m = nextM();
    Z sum = Z.ZERO;
    for (long t = 0; t <= m + 2; ++t) {
      for (long c = -(m + 3); c <= m + 2; ++c) {
        final Z val = f(m, c, t);
        if (val.signum() > 0) { // inside Siegel triangle
          sum = sum.add(Functions.SIGMA1.z(val));
        }
      }
    }
    return sum.divide(3);
  }
}
