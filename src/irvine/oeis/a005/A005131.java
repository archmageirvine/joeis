package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005131.
 * @author Sean A. Irvine
 */
public class A005131 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN % 3 == 1 ? Z.valueOf(mN - 1).divide(3).multiply2() : Z.ONE;
  }
}

