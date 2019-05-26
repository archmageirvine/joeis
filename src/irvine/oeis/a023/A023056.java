package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001597;
import irvine.util.RuntimeUtils;

/**
 * A023056 <code>a(n)</code> is least k such that k and <code>k+n</code> are adjacent nontrivial powers of positive integers, or 0 if no such k apparently exists.
 * @author Sean A. Irvine
 */
public class A023056 implements Sequence {

  private static final int MAX_TERMS = RuntimeUtils.isTest() ? 10000 : 100000;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Sequence s = new A001597();
    Z a = s.next();
    for (int k = 0; k < MAX_TERMS; ++k) {
      final Z b = s.next();
      if (b.subtract(a).equals(mN)) {
        return a;
      }
      a = b;
    }
    return Z.ZERO; // heuristic
  }
}
