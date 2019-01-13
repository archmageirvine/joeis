package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;
import irvine.oeis.a000.A000005;

/**
 * A002744.
 * @author Sean A. Irvine
 */
public class A002744 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z kf = Z.ONE;
    boolean add = (mN & 1) == 1;
    final A000005 seq = new A000005();
    for (long k = 1; k <= mN; ++k, add = !add) {
      s = s.signedAdd(add, seq.next().multiply(kf).multiply(Binomial.binomial(mN, k)));
      kf = kf.multiply(k);
    }
    return s;
  }
}
