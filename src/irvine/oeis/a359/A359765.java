package irvine.oeis.a359;
// manually at 2023-07-09 21:27

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359765 Positions of odd terms in A359763, where A359763 is the Dirichlet inverse of characteristic function of the numbers with an even number of prime factors (counted with multiplicity).
 * @author Georg Fischer
 */
public class A359765 extends Sequence1 {

  private int mN = 0;
  private final A359763 mSeq = new A359763();

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
