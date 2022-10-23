package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055541 Total number of leaves (nodes of vertex degree 1) in all labeled trees with n nodes.
 * @author Sean A. Irvine
 */
public class A055541 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN++).pow(mN - 2).multiply(mN);
  }
}
