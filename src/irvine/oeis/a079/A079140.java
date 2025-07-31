package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014574;

/**
 * A079140 Numbers n such that (Product of first n twin prime pair averages [A014574]) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A079140 extends Sequence1 {

  private final Sequence mSeq = new A014574();
  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mProd = mProd.multiply(mSeq.next());
      if (mProd.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

