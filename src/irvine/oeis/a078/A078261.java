package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a019.A019520;

/**
 * A078261 a(n) = numerator(N) where N = 0.246...(2n) is the concatenation of the first n even numbers after the decimal point.
 * @author Sean A. Irvine
 */
public class A078261 extends A019520 {

  @Override
  public Z next() {
    final Z t = super.next();
    return new Q(t, Z.TEN.pow(Functions.DIGIT_LENGTH.z(t))).num();
  }
}

