package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A079946 Numbers k whose binary expansion begins with two or more 1's and ends with at least one 0.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A079946 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    return Z.ONE.shiftLeft(n.bitLength()).add(n).multiply2();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
