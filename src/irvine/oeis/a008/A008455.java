package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008455 11th powers: <code>a(n) = n^11</code>.
 * @author Sean A. Irvine
 */
public class A008455 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(11);
  }
}
