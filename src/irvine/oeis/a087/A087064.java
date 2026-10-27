package irvine.oeis.a087;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087064 Sum{Floor(n*r^k): r=1/sqrt(2), k&gt;=0}.
 * @author Sean A. Irvine
 */
public class A087064 extends Sequence0 {

  // Name does not match data

  private static final CR INV_SQRT2 = CR.SQRT2.inverse();
  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    long k = -1;
    while (true) {
      final Z t = INV_SQRT2.pow(++k).multiply(mN).floor();
      if (t.isZero()) {
        return sum;
      }
      sum = sum.add(t);
    }
  }
}

