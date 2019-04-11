package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002561 <code>a(n) = n^5 + 1</code>.
 * @author Sean A. Irvine
 */
public class A002561 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(5).add(1);
  }
}
