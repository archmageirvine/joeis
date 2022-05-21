package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000567 Octagonal numbers: n*(3*n-2). Also called star numbers.
 * @author Sean A. Irvine
 */
public class A000567 implements Sequence {

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(3).subtract(2).multiply(mN);
  }
}

