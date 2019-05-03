package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001695 <code>a(n) = H_n(2,n)</code> where <code>H_n</code> is the n-th hyperoperator.
 * @author Sean A. Irvine
 */
public class A001695 implements Sequence {

  private static final long[] VALUES = {1, 3, 4, 8, 65536};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= VALUES.length) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(VALUES[mN]);
  }
}
