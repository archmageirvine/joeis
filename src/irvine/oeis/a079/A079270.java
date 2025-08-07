package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079270 Nonpalindromic squares k such that reverse(k) - k is a positive cube.
 * @author Sean A. Irvine
 */
public class A079270 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      final Z r = Functions.REVERSE.z(s);
      final Z d = r.subtract(s);
      if (d.signum() > 0 && Predicates.CUBE.is(d)) {
        return s;
      }
    }
  }
}

