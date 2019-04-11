package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016956 <code>a(n) = (6*n + 3)^12</code>.
 * @author Sean A. Irvine
 */
public class A016956 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(12);
  }
}

