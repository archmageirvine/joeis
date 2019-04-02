package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016980 a(n) = (6*n + 5)^12.
 * @author Sean A. Irvine
 */
public class A016980 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(12);
  }
}

