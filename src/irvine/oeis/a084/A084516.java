package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084516 The length of each successively larger, indecomposable 3-ball ground-state site swap given in A084511, i.e., the number of digits in each term of A084512.
 * @author Sean A. Irvine
 */
public class A084516 extends A084511 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mS.belgthor(++mN).length);
  }
}
