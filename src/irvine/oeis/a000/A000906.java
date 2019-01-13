package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000906.
 * @author Sean A. Irvine
 */
public class A000906 implements Sequence {

  private Z mDF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    mDF = mDF.multiply(mN);
    return mDF.multiply(mN + 2).divide(3).subtract(mDF);
  }
}

