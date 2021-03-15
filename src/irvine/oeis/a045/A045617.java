package irvine.oeis.a045;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045617 Smallest a(n) so that the first digits right of the decimal point in sqrt(a(n)) are the digits of n.
 * @author Sean A. Irvine
 */
public class A045617 implements Sequence {

  private long mN = 0;
  private long mT = 10;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10;
    }
    long k = 1;
    while (CR.valueOf(++k).sqrt().multiply(mT).floor().mod(mT) != mN) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
