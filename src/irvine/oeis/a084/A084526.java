package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084526 The length of each successively larger, indecomposable, 'prime' 3-ball ground-state site swap given in A084521, i.e., the number of digits in each term of A084522.
 * @author Sean A. Irvine
 */
public class A084526 extends A084521 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mS.belgthor(++mN).length);
  }
}
