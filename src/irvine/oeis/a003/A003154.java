package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003154 Centered 12-gonal numbers. Also star numbers: 6*n*(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A003154 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mN;
    mN = mN.add(1);
    return mN.multiply(t).multiply(6).add(1);
  }
}
