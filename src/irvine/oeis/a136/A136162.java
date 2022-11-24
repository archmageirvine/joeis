package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.a007.A007530;

/**
 * A136162 List of prime quadruplets {p, p+2, p+6, p+8}.
 * @author Georg Fischer
 */
public class A136162 extends A007530 {

  private int mN = 0;
  private Z mA;
  private static final int[] mIncr = new int[]{8, 0, 2, 6};

  @Override
  public Z next() {
    // [a(4n-3),a(4n-2),a(4n-1),a(4n)] = A007530(n) + [0, 2, 6, 8], for all n>0
    ++mN;
    if ((mN & 3) == 1) {
      mA = super.next();
    }
    return mA.add(mIncr[mN & 3]);
  }
}
