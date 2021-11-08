package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034797 a(0) = 0; a(n+1) = a(n) + 2^a(n).
 * @author Sean A. Irvine
 */
public class A034797 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.add(Z.ONE.shiftLeft(mA.intValueExact()));
    return mA;
  }
}
