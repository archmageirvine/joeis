package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000806 Bessel polynomial <code>y_n(-1)</code>.
 * @author Sean A. Irvine
 */
public class A000806 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = mB.multiply(1 - 2 * ++mN).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

