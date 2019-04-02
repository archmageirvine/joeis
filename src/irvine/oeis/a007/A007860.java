package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007860 Maximal matchings in rooted plane trees on n nodes.
 * @author Sean A. Irvine
 */
public class A007860 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final ArrayList<Polynomial<Z>> C = new ArrayList<>(7);
  static {
    C.add(Polynomial.create(0, -1, -1, 0, 1));
    C.add(Polynomial.create(1, 6, 2));
    C.add(Polynomial.create(-6, -15));
    C.add(Polynomial.create(15, 20, -2));
    C.add(Polynomial.create(-20, -15, 1));
    C.add(Polynomial.create(15, 6));
    C.add(Polynomial.create(-6, -1));
    C.add(RING.one());
  }

  private int mN = 0;
  private Polynomial<Z> mF = RING.zero();

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> f = RING.one();
    Polynomial<Z> t = RING.zero();
    for (final Polynomial<Z> c : C) {
      t = RING.add(t, RING.multiply(f, c, mN));
      f = RING.multiply(f, mF, mN);
    }
    final Z res = t.coeff(mN).negate();
    mF = RING.add(mF, RING.monomial(res, mN));
    return res;
  }
}
