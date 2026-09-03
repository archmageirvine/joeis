package irvine.oeis.a193;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A193995 Maximum number of terms required to determine whether a number is happy or not (A007770 or A031177).
 * @author Sean A. Irvine
 */
public class A193995 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    final HashSet<Z> seen = new HashSet<>();
    long cnt = 0;
    while (true) {
      ++cnt;
      if (Z.ONE.equals(n)) {
        return Z.valueOf(cnt);
      }
      if (!seen.add(n)) {
        return Z.valueOf(cnt - 1);
      }
      n = Functions.DIGIT_SUM_SQUARES.z(n);
    }
  }
}
