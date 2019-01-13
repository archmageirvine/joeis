package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010062.
 * @author Sean A. Irvine
 */
public class A010062 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(mA.bitCount());
    return mA;
  }
}

