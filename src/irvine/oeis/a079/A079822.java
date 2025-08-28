package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A079822 Smallest n-digit multiple of the n-th composite number.
 * @author Sean A. Irvine
 */
public class A079822 extends A002808 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z c = super.next();
    return Z.TEN.pow(++mN).add(c.subtract(1)).divide(c).multiply(c);
  }
}

