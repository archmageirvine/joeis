package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001504 <code>a(n) = (3n+1)(3n+2)</code>.
 * @author Sean A. Irvine
 */
public class A001504 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(3);
    return mN.multiply(mN.add(1));
  }
}
