package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A064479 Complement of A064478.
 * @author Sean A. Irvine
 */
public class A064479 extends A064478 {

  private static final int HEURISTIC = 10;
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      for (int k = 0; k < HEURISTIC; ++k) {
        final Z t = super.next();
        if (t.compareTo(mN) < 0) {
          throw new RuntimeException("Heuristic failed, previously output values could be in error");
        }
        mA.add(t);
      }
      mN = mN.add(1);
      if (!mA.remove(mN)) {
        return mN;
      }
    }
  }
}
