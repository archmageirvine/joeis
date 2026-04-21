package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084506 The length of each successively larger 3-ball ground-state site swap given in A084501, i.e., the number of digits in each term of A084502.
 * @author Sean A. Irvine
 */
public class A084506 extends A084501 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mS.belgthor(++mN).length);
  }
}
