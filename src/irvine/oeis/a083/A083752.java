package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A083752 Minimal k &gt; n such that (4*k+3*n) * (4*n+3*k) is a square.
 * @author Sean A. Irvine
 */
public class A083752 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    final Z n3 = Z.valueOf(3 * n);
    final Z n4 = Z.valueOf(Math.multiplyExact(4L, n));
    long k = n;
    while (true) {
      ++k;
      if (Predicates.SQUARE.is(n4.add(3 * k).multiply(n3.add(Math.multiplyExact(4L, k))))) {
        return Z.valueOf(k);
      }
    }
  }
}
