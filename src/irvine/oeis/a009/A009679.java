package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.a005.A005326;

/**
 * A009679 Number of partitions of {1, ..., 2n} into coprime pairs.
 * @author Sean A. Irvine
 */
public class A009679 extends A005326 {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return permanent(mN).sqrt();
  }
}

