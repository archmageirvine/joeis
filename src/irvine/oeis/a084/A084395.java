package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084395 A084394(n)/n.
 * @author Sean A. Irvine
 */
public class A084395 extends A084393 {

  private long mK = 1;

  @Override
  public Z next() {
    if (super.next().isOne()) {
      return Z.ONE;
    }
    super.next();
    return Z.valueOf(mSums.get(++mK) / mK);
  }
}
