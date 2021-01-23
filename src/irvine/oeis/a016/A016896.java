package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016896 a(n) = (5*n + 3)^12.
 * @author Sean A. Irvine
 */
public class A016896 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(12);
  }
}

