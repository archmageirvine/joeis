package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018084 Powers of fourth root of 14 rounded down.
 * @author Sean A. Irvine
 */
public class A018084 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(14);
    return mN.root(4);
  }
}

