package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073857 a(1) = 1, a(n) = prime obtained as a partial sum of A073856.
 * @author Sean A. Irvine
 */
public class A073857 extends Sequence1 {

  private Z mA = null;
  private final HashSet<Z> mUsed = new HashSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    ++mN;
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN);
      if (!mUsed.contains(t)) {
        final Z u = mA.add(t);
        if (u.isProbablePrime()) {
          mA = u;
          mUsed.add(t);
          return mA;
        }
      }
    }
  }
}
