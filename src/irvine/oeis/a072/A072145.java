package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072099.
 * @author Sean A. Irvine
 */
public class A072145 extends Sequence1 {

  private Z mN = Z.valueOf(100000114411L);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z t = mN;
      final HashSet<Z> seen = new HashSet<>();
      seen.add(t);
      while (seen.add(t = t.subtract(Functions.REVERSE.z(t)).abs())) {
        // do nothing
      }
      final Z q = t;
      long cnt = 0;
      while (!(t = t.subtract(Functions.REVERSE.z(t)).abs()).equals(q)) {
        if (++cnt > 14) {
          return mN;
        }
      }
    }
  }
}
