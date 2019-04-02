package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018057 Powers of fourth root of 5 rounded down.
 * @author Sean A. Irvine
 */
public class A018057 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(5);
    return mN.root(4);
  }
}

