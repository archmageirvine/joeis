package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073854 extends Sequence1 {

  private Z mA = null;
  private final HashSet<Long> mUsed = new HashSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      if (!mUsed.contains(++k)) {
        final Z t = Z.valueOf(k).square();
        final Z u = mA.add(t);
        if (u.isProbablePrime()) {
          mA = u;
          mUsed.add(k);
          return mA;
        }
      }
    }
  }
}
