package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016944 a(n) = (6*n + 2)^12.
 * @author Sean A. Irvine
 */
public class A016944 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(12);
  }
}

