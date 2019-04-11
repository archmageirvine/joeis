package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005563 <code>a(n) = n*(n+2) = (n+1)^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A005563 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().subtract(1);
  }
}

