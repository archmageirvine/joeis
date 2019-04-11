package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import org.apfloat.Apfloat;

/**
 * A000709 Related to population of numbers of form <code>x^2 +</code> y^2.
 * @author Sean A. Irvine
 */
public class A000709 implements Sequence {

  private static final int PRECISION = 500;
  private static final Apfloat HALF = new Apfloat("0.5", PRECISION);

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Apfloat u = A000691.sqrtLnInt(mN);
    return Z.valueOf(u.add(HALF).truncate().toBigInteger());
  }
}
