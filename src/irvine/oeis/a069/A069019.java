package irvine.oeis.a069;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069019 Smallest square k &gt; 1 such that n*k + 1 is also a square or 0 if no such term exists, i.e., when n is a square.
 * @author Sean A. Irvine
 */
public class A069019 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    final long n1 = ++mN;
    if (Predicates.SQUARE.is(n1)) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    long k = 1;
    while (true) {
      if (n.multiply(++k * k).add(1).isSquare()) {
        return Z.valueOf(k * k);
      }
    }
  }
}

