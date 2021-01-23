package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000168 a(n) = 2*3^n*(2*n)!/(n!*(n+2)!).
 * @author Sean A. Irvine
 */
public class A000168 implements Sequence {

  private final A000108 mSeq = new A000108();
  private long mN = -1;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    final Z r = mSeq.next();
    if (++mN != 0) {
      mA = mA.multiply(3);
    }
    return mA.multiply(r).divide(mN + 2);
  }
}

