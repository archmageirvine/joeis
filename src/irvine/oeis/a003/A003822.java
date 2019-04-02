package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A003822 Number of commutative elements in Coxeter group E_n.
 * @author Sean A. Irvine
 */
public class A003822 extends A000108 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM0 = Polynomial.create(16, -52, 45);
  private static final Polynomial<Z> DEN0 = Polynomial.create(1, -7, 14, -9);
  private static final Polynomial<Z> NUM1 = Polynomial.create(-6, 14, -12);
  private static final Polynomial<Z> DEN1 = Polynomial.create(1, -4, 5, -3);
  private static final Polynomial<Z> NUM2 = Polynomial.create(1, 0, 0, -1, -1);
  private static final Polynomial<Z> DEN2 = Polynomial.create(1, -1, -1, 0, 0, 1);
  private List<Z> mCatalan = new ArrayList<>();

  {
    super.next();
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mCatalan.add(super.next());
    final Z a = RING.coeff(RING.subtract(NUM0, RING.create(mCatalan)), DEN0, mN);
    final Z b = RING.coeff(NUM1, DEN1, mN);
    final Z c = RING.coeff(NUM2, DEN2, mN);
    return a.add(b).add(c);
  }
}

