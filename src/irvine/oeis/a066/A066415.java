package irvine.oeis.a066;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066415 Denominators of coefficients in series expansion of -512*(1+x)^3/(x-8)^3.
 * @author Sean A. Irvine
 */
public class A066415 extends Sequence0 {

  private static final Polynomial<Q> NUM = Polynomial.create(new Q(-512), new Q(-1536), new Q(-1536), new Q(-512));
  private static final Polynomial<Q> DEN = Polynomial.create(new Q(-512), new Q(192), new Q(-24), Q.ONE);
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN).den();
  }
}

