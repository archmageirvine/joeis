package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000292 Tetrahedral (or triangular pyramidal) numbers: <code>a(n) =</code> C(n+2,3) <code>= n*(n+1)*(n+2)/6</code>.
 * @author Sean A. Irvine
 */
public class A000292 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.add(2)).divide(6);
  }
}
