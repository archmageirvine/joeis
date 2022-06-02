package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057330 First member of a prime n-tuplet in a 2p-1 progression.
 * @author Sean A. Irvine
 */
public class A057330 extends A000040 {

  private int mN = 0;
  private Z mP = super.next();

  private boolean is(Z p) {
    for (int k = 1; k < mN; ++k) {
      p = p.multiply2().subtract(1);
      if (!p.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mP)) {
      mP = super.next();
    }
    return mP;
  }
}
