package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007925.
 * @author Sean A. Irvine
 */
public class A007925 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN + 1).subtract(Z.valueOf(mN + 1).pow(mN));
  }
}
