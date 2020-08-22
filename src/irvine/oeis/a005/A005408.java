package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005408 The odd numbers: a(n) = 2*n + 1.
 * @author Sean A. Irvine
 */
public class A005408 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    return mN;
  }
}
