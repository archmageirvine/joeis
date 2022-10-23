package irvine.oeis.a000;

import org.apfloat.Apfloat;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000694 Related to population of numbers of form x^2 + y^2.
 * @author Sean A. Irvine
 */
public class A000694 extends Sequence1 {

  private static final int PRECISION = 500;
  private static final Apfloat HALF = new Apfloat("0.5", PRECISION);
  private static final Apfloat B = new Apfloat(A000690.C0.substring(0, PRECISION)).multiply(new Apfloat(2, PRECISION)).divide(new Apfloat(3, PRECISION));

  private int mN = 0;

  @Override
  public Z next() {
    final Apfloat u = A000691.sqrtLnInt(++mN);
    return Z.valueOf(u.multiply(B).add(HALF).truncate().toBigInteger());
  }
}
