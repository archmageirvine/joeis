package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050924 a(n) = (a(n-1)+1)^(a(n-1)), a(0) = 0.
 * @author Sean A. Irvine
 */
public class A050924 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.add(1).pow(mA);
    return mA;
  }
}
