package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059175 For a rational number p/q let f(p/q) = p*q divided by the sum of digits of p and q; a(n) is obtained by iterating f, starting at n/1, until an integer is reached, or if no integer is ever reached then a(n) = 0.
 * @author Sean A. Irvine
 */
public class A059175 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Q f = new Q(mN);
    while (true) {
      final Q prev = f;
      final Z g = f.num().multiply(f.den());
      f = new Q(g, Z.valueOf(Functions.DIGIT_SUM.l(f.num()) + Functions.DIGIT_SUM.l(f.den())));
      if (f.isInteger()) {
        return f.toZ();
      }
      if (f.equals(prev)) {
        return Z.ZERO;
      }
    }
  }
}
