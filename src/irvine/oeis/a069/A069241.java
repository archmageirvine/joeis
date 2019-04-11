package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000930;

/**
 * A069241 Number of Hamiltonian paths in the graph on n vertices <code>{1,...,n},</code> with i adjacent to j iff |i-j|&lt;=2.
 * @author Sean A. Irvine
 */
public class A069241 extends A000930 {

  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z a = mB;
    mB = mC;
    mC = super.next();
    return mC.multiply(3).add(mB).add(a).subtract(mN);
  }
}

