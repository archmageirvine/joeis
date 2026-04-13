package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002476;

/**
 * A394567 allocated for Dao Van Tam.
 * @author Sean A. Irvine
 */
public class A394567 extends A002476 {

  // After Dao Van Tam

  private long mod3(final Z c) {
    return c.signum() >= 0 ? c.mod(3) : (3 - c.negate().mod(3)) % 3;
  }

  @Override
  public Z next() {
    final Z q = super.next();
    final Z sqrt = q.multiply(4).divide(27).sqrt();
    for (Z b = sqrt.negate().subtract(1); b.compareTo(sqrt.add(1)) <= 0; b = b.add(1)) {
      final Z d = q.multiply(4).subtract(b.square().multiply(27));
      if (d.signum() >= 0) {
        final Z[] sq = d.sqrtAndRemainder();
        if (sq[1].isZero()) {
          final Z s = sq[0];
          for (long j = 0; j <= 1; ++j) {
            final Z a2 = Z.NEG_ONE.pow(j).multiply(s).subtract(b);
            if (a2.isEven()) {
              final Z a = a2.divide2();
              if (a.square().add(a.multiply(b)).add(b.square().multiply(7)).equals(q) && Functions.GCD.z(a.abs(), b.abs()).isOne()) {
                final Z c = a.multiply2().add(b);
                if (mod3(c) == 1) {
                  return c.add(3).multiply(q).subtract(1).divide(27);
                }
                if (mod3(c.negate()) == 1) {
                  return Z.THREE.subtract(c).multiply(q).subtract(1).divide(27);
                }
              }
            }
          }
        }
      }
    }
    throw new RuntimeException();
  }
}
