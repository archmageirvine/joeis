package irvine.oeis.a359;
// manually at 2023-07-09 21:27

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a065.A065043;

/**
 * A359767 Numbers k such that A065043(k) = 1 but A359764(k) = 0, where A359764 is the parity of Dirichlet inverse of the former (which is the characteristic function of the numbers with an even number of prime factors).
 * @author Georg Fischer
 */
public class A359767 extends Sequence1 {

  private int mN = 0;
  private final A065043 mSeq1 = new A065043();
  private final A359764 mSeq2 = new A359764();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t1 = mSeq1.next();
      final Z t2 = mSeq2.next();
      if (t1.equals(Z.ONE) && t2.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
