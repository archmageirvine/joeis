package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003469 Number of minimal covers of an <code>(n + 1)-set</code> by a collection of n nonempty subsets, <code>a(n) = A035348(n,n-1)</code>.
 * @author Sean A. Irvine
 */
public class A003469 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.shiftLeft(mN - 1).subtract(n.multiply(mN + 1).divide2());
  }
}

