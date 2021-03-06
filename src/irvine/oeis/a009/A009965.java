package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009965 Powers of 21.
 * @author Sean A. Irvine
 */
public class A009965 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(21);
    return mA;
  }
}
