package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001008;
import irvine.oeis.a065.A065091;

/**
 * A072984 Least k such that prime(n) appears in the factorization of A001008(k) (the numerator of the k-th harmonic number).
 * @author Sean A. Irvine
 */
public class A072984 extends Sequence2 {

  private final Sequence mPrimes = new A065091();
  private final DirectSequence mH = DirectSequence.create(1, new A001008());

  @Override
  public Z next() {
    final Z p = mPrimes.next();
    int k = 0;
    while (true) {
      if (mH.a(++k).mod(p).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

