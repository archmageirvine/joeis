package irvine.oeis.a074;

import irvine.math.group.GaloisField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001037.
 * @author Sean A. Irvine
 */
public class A074000 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final GaloisField gf = new GaloisField(Z.THREE, mN);
    long cnt = 0;
    for (final Z a : gf) {
      final Polynomial<Z> cp = gf.characteristicPolynomial(a);
      if (cp.coeff(mN - 1).isZero() && cp.coeff(mN - 2).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
