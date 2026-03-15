package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000272 Number of trees on n labeled nodes: n^(n-2) with a(0)=1.
 * @author Sean A. Irvine
 */
public class A000272 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return n.compareTo(Z.TWO) <= 0 ? Z.ONE : n.pow(n.subtract(2));
  }

  @Override
  public Z a(final long n) {
    return n <= 2 ? Z.ONE : Z.valueOf(n).pow(n - 2);
  }

}
