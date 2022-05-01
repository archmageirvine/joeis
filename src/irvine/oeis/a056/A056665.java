package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056636.
 * @author Sean A. Irvine
 */
public class A056665 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.valueOf(mN).pow(mN / d).multiply(LongUtils.phi(d))).divide(mN);
  }
}
