package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A058773 McKay-Thompson series of class 105A for Monster.
 * @author Sean A. Irvine
 */
public class A058773 extends A058640 {

  private static final Polynomial<Z> C13 = RING.monomial(Z.valueOf(13), 6);
  private static final Polynomial<Z> C15 = RING.monomial(Z.valueOf(15), 7);
  private final Polynomial<Z> mT35Ax1 = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mT35Ax1.add(super.next()); // scaled by x
    final Polynomial<Z> p3x3 = mT35Ax1.substitutePower(3, mN); // scaled by x^3
    final Polynomial<Z> t1 = RING.add(mT35Ax1.shift(2), p3x3); // scaled by x^3
    final Polynomial<Z> t2 = RING.multiply(mT35Ax1, p3x3, mN); // scaled by x^4
    final Polynomial<Z> num = RING.subtract(RING.subtract(RING.add(RING.multiply(t1, t2, mN),
      RING.multiply(t2.shift(3), Z.THREE)),
      RING.multiply(t1.shift(4), Z.FIVE)),
      C15); // scaled by x^7
    final Polynomial<Z> den = RING.add(RING.add(RING.subtract(RING.multiply(t1, t1, mN), t2.shift(2)),
      RING.multiply(t1.shift(3), Z.SIX)), C13); // scaled by x^6
    return RING.coeff(num, den, mN);
  }
}

/*
t1=T35A+P3(T35A); t2=T35A*P3(T35A);
T105A=(t1*t2+3*t2-5*t1-15)/(t1^2-t2+6*t1+13);
 */
