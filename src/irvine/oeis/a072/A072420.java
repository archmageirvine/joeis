package irvine.oeis.a072;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072420 Minimum number of steps needed to transform n into 153 where each step is either tripling or taking the sum of cubes of digits.
 * @author Sean A. Irvine
 */
public class A072420 extends Sequence1 {

  private static final Z Z153 = Z.valueOf(153);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Set<Z> s = new HashSet<>();
    s.add(mN);
    long cnt = 0;
    while (!s.contains(Z153)) {
      ++cnt;
      final Set<Z> t = new HashSet<>();
      for (final Z v : s) {
        t.add(v.multiply(3));
        t.add(Functions.DIGIT_SUM_CUBES.z(v));
      }
      s = t;
    }
    return Z.valueOf(cnt);
  }
}
