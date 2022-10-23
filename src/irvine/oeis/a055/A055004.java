package irvine.oeis.a055;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055004 Boris Stechkin's function.
 * @author Sean A. Irvine
 */
public class A055004 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(2, ++mN, k -> Z.valueOf(k - 1).multiply(mN * (long) (k - 1) / k));
  }
}

