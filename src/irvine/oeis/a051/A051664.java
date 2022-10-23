package irvine.oeis.a051;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence1;

/**
 * A051664 a(n) is the number of nonzero coefficients in the n-th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A051664 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Polynomial<Z> p = Cyclotomic.cyclotomic(++mN);
    int cnt = 0;
    for (final Z c : p) {
      if (!c.isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
