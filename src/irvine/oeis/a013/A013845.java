package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013845 a(n) = 7^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013845 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(2401) : mA.multiply(16807);
    return mA;
  }
}
