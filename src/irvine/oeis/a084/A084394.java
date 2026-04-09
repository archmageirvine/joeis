package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084394 Sum of n terms starting with the n-th term of A084393.
 * @author Sean A. Irvine
 */
public class A084394 extends A084393 {

  private long mK = 1;

  @Override
  public Z next() {
    if (super.next().isOne()) {
      return Z.ONE;
    }
    super.next();
    return Z.valueOf(mSums.get(++mK));
  }
}
