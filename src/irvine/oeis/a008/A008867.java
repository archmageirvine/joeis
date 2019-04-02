package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008867 Triangle of truncated triangular numbers: k-th term in n-th row is number of dots in hexagon of sides k, n-k, k, n-k, k, n-k.
 * @author Sean A. Irvine
 */
public class A008867 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    final Z n = Z.valueOf(mN);
    return n.multiply(mN - 3).divide2().add(n.multiply(mM)).subtract(Z.valueOf(mM).square()).add(1);
  }
}

