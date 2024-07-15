package irvine.oeis.a001;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a213.A213262;
import irvine.oeis.triangle.DirectArray;

/**
 * A001258 Number of labeled n-node trees with unlabeled end-points.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A001258 extends Sequence2 implements DirectSequence {

  private static final DirectArray A213262 = new A213262();
  private int mN = 1;

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
    return (n <= 3) ? Z.ONE : Integers.SINGLETON.sum(2, n - 1, k -> A213262.a(n, k));
  }

}
