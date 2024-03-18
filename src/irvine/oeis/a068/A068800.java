package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A068800 The next new gap between successive Ulam numbers.
 * @author Sean A. Irvine
 */
public class A068800 extends A002858 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z u = mA.subtract(t);
      if (mSeen.add(u)) {
        return u;
      }
    }
  }
}
