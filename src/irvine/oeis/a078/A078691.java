package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001223;
import irvine.oeis.a007.A007913;

/**
 * A078691 Numbers n such that the n-th difference between 2 successive primes equals the squarefree part of n.
 * @author Sean A. Irvine
 */
public class A078691 extends Sequence1 {

  private final Sequence mSeq1 = new A001223();
  private final Sequence mSeq2 = new A007913();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq1.next().equals(mSeq2.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

