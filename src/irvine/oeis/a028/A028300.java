package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028300 a(1) = 1; thereafter a(n+1) = a(n)^2 + n.
 * @author Sean A. Irvine
 */
public class A028300 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.square().add(mN);
    }
    return mA;
  }
}

