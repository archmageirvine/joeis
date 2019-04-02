package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013884 a(n) = 17^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013884 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(4913) : mA.multiply(1419857);
    return mA;
  }
}
