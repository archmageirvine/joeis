package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a019.A019520;

/**
 * A078260 a(n) = denominator(N), where N = 0.246...up to 2n (concatenation 2 to 2n of first n even numbers after decimal point).
 * @author Sean A. Irvine
 */
public class A078260 extends A019520 {

  @Override
  public Z next() {
    final Z t = super.next();
    return new Q(t, Z.TEN.pow(Functions.DIGIT_LENGTH.z(t))).den();
  }
}

