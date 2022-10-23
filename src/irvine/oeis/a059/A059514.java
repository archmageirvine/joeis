package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A059514 For a rational number p/q let f(p/q) = p*q divided by (the sum of digits of p and of q) minus 1; a(n) is obtained by iterating f, starting at n/1, until an integer is reached, or if no integer is ever reached then a(n) = 0.
 * @author Sean A. Irvine
 */
public class A059514 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Q f = new Q(++mN);
    final HashSet<Q> seen = new HashSet<>();
    while (true) {
      if (!seen.add(f)) {
        return Z.ZERO;
      }
      final Z g = f.num().multiply(f.den());
      f = new Q(g, Z.valueOf(ZUtils.digitSum(f.num()) + ZUtils.digitSum(f.den()) - 1));
      if (f.isInteger()) {
        return f.toZ();
      }
    }
  }
}
