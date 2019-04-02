package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013853 a(n) = 9^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013853 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(6561) : mA.multiply(59049);
    return mA;
  }
}
