package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072140 The period length of the 'Reverse and Subtract' trajectory of n is greater than 1.
 * @author Sean A. Irvine
 */
public class A072140 extends Sequence1 {

  private Z mN = Z.valueOf(1011);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z t = mN;
      final HashSet<Z> seen = new HashSet<>();
      long cnt = 0;
      seen.add(t);
      while (seen.add(t = t.subtract(Functions.REVERSE.z(t)).abs())) {
        ++cnt;
      }
      final Z q = t;
      while (!(t = t.subtract(Functions.REVERSE.z(t)).abs()).equals(q)) {
        --cnt;
      }
      if (seen.size() - cnt > 1) {
        return mN;
      }
    }
  }
}
