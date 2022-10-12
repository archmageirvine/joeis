package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059842 The next square after a(n)^3 is a(n+1)^2.
 * @author Sean A. Irvine
 */
public class A059842 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.pow(3).sqrt().add(1);
    return mA;
  }
}
