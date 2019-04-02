package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017984 Powers of cube root of 3 rounded up.
 * @author Sean A. Irvine
 */
public class A017984 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return mN.root(3).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

