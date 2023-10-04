package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066188 Sum of the second moments of all partitions of n.
 * @author Sean A. Irvine
 */
public class A066188 extends A066187 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, mN, 0)[1];
  }
}
