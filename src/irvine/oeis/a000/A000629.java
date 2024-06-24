package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000629 Number of necklaces of partitions of n+1 labeled beads.
 * @author Sean A. Irvine
 */
public class A000629 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Z r = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      final Z t = Functions.STIRLING2.z(n, k).multiply(Functions.FACTORIAL.z(k)).shiftLeft(k);
      r = r.signedAdd(((n - k) & 1) == 0, t);
    }
    return r;
  }

}

