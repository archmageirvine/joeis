package irvine.oeis.a159;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A159257 Rank deficiency of the Lights Out problem of size n.
 * @author Sean A. Irvine
 */
public class A159257 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(new GaloisField(2));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    Polynomial<Z> q = RING.x();
    for (int u = 2; u <= mN; ++u) {
      final Polynomial<Z> r = RING.add(q.shift(1), p);
      p = q;
      q = r;
    }
    p = RING.substitute(q, Polynomial.create(1, 1));
    final Polynomial<Z> t = RING.gcd(p, q);
    return Z.valueOf(t.degree());
  }
}
