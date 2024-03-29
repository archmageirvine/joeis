package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003154 Centered 12-gonal numbers, or centered dodecagonal numbers: numbers of the form 6*k*(k-1) + 1.
 * @author Sean A. Irvine
 */
public class A003154 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mN;
    mN = mN.add(1);
    return mN.multiply(t).multiply(6).add(1);
  }
}
