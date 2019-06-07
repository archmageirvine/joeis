package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001523 Number of stacks, or planar partitions of n; also weakly unimodal compositions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A001523 extends A001522 {

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return RING.coeff(sum(mN), RING.pow(prod(mN), 2, mN), mN);
  }
}
