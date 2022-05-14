package irvine.oeis.a056;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056923 Write the integers in groups: 0; 1,2; 3,4,5; 6,7,8,9; ... and form the product of the members of each group.
 * @author Sean A. Irvine
 */
public class A056923 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN + 1, j -> Z.valueOf(mN + 2).multiply(mN + 1).divide2().subtract(j));
  }
}

