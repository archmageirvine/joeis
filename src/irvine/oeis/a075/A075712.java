package irvine.oeis.a075;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075697.
 * @author Sean A. Irvine
 */
public class A075712 extends A000040 {

  private final TreeSet<Z> mUsed = new TreeSet<>();
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    mP = mP.multiply2().add(1);
    if (mP.isProbablePrime()) {
      mUsed.add(mP);
      return mP;
    }
    while (true) {
      mP = super.next();
      if (!mUsed.remove(mP)) {
        return mP;
      }
    }
  }
}
