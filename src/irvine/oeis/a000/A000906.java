package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000906 Exponential generating function: 2*(1+3*x)/(1-2*x)^(7/2).
 * @author Sean A. Irvine
 */
public class A000906 extends Sequence0 {

  private Z mDF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    mDF = mDF.multiply(mN);
    return mDF.multiply(mN + 2).divide(3).subtract(mDF);
  }
}

