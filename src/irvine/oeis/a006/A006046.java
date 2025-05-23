package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A006046 Total number of odd entries in first n rows of Pascal's triangle: a(0) = 0, a(1) = 1, a(2k) = 3*a(k), a(2k+1) = 2*a(k) + a(k+1).  a(n) = Sum_{i=0..n-1} 2^wt(i).
 * @author Sean A. Irvine
 */
public class A006046 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    if (n.isZero()) {
      return Z.ZERO;
    }
    if (n.isOne()) {
      return Z.ONE;
    }
    final Z q = a(n.divide2()).multiply(3);
    if (n.isEven()) {
      return q;
    }
    final long pop = n.subtract(1).bitCount();
    return q.add(Z.ONE.shiftLeft(pop));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
