package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014137;
import irvine.oeis.a030.A030101;
import irvine.oeis.a037.A037012;
import irvine.oeis.a070.A070939;

/**
 * A215406 A ranking algorithm for the lexicographic ordering of the Catalan families.
 * @author Sean A. Irvine
 */
public class A215406 extends A037012 {

  private final A070939 mC = new A070939();
  private final A030101 mA = new A030101();
  private final DirectSequence mB = DirectSequence.create(new A014137());

  @Override
  public Z next() {
    final long m = mC.next().longValueExact() / 2;
    Z a = mA.next();
    long y = 0;
    Z t = Z.ONE;
    for (long x = 0; x < 2 * m - 1; ++x) {
      if (a.isOdd()) {
        ++y;
      } else {
        final long u = 2 * m - x;
        final long v = m - 1 - (x + y) / 2;
        t = t.add(get(u, v));
        --y;
      }
      a = a.divide2();
    }
    return mB.a(Z.valueOf(m)).subtract(t);
  }
}

