package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008456 <code>12th</code> powers: <code>a(n) = n^12</code>.
 * @author Sean A. Irvine
 */
public class A008456 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(12);
  }
}
