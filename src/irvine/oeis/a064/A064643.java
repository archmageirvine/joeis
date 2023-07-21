package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064643 Bidirectional 'Delannoy' variation of the Boustrophedon transform applied to all 1's sequence: Fill an triangular array in alternating directions. Let the first element of each row in that direction be equal to 1. Each next entry is given by T(n,k) = T(n,k +/- 1) + T(n-1,k-1) + T(n-1,k) + T(n-2,k-1), where the +/- depends on which is the previous element in the direction one is filling in the row. The final number of row n gives a(n).
 * @author Sean A. Irvine
 */
public class A064643 extends A064644 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, (mN & 1) == 0 ? mN : 0);
  }
}
