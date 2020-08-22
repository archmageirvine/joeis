package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005206;

/**
 * A003258 The number m such that c'(m) = A005206(A003231(n)), where c'(m) = A249115(m) is the m-th positive integer not in A003231.
 * @author Sean A. Irvine
 */
public class A003258 extends A003231 {

  private final A005206 mS = new A005206();

  private Z get(final int n) {
    while (n >= mS.size()) {
      mS.next();
    }
    return mS.get(n);
  }

  @Override
  public Z next() {
    final Z n = get(super.next().intValueExact());
    final Sequence s = new ComplementSequence(new A003231(), Z.ONE);
    long m = 1;
    while (!s.next().equals(n)) {
      ++m;
    }
    return Z.valueOf(m);
  }

}
