package irvine.oeis.a359;
// manually at 2023-07-09 21:27

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359817 Positions of odd terms in A359815, where A359815 is the Dirichlet inverse of A359770,
 * which is the characteristic function for numbers k such that k and bigomega(k) are of different parity.
 * @author Georg Fischer
 */
public class A359817 extends Sequence1 {

  private int mN = 0;
  private final A359815 mSeq = new A359815();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq.next().isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}
