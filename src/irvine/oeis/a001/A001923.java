package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001923 a(n) = Sum_{k=1..n} k^k.
 * @author Sean A. Irvine
 */
public class A001923 extends Sequence0 {

  private Z mN = Z.NEG_ONE;
  private Z mS = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    mS = mS.add(mN.pow(mN));
    return mS;
  }
}
