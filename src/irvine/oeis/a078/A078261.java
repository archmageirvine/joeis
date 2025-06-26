package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a019.A019520;

/**
 * A078261 Smallest integer multiple of the decimal number N = 0.246...up to 2n (decimal point followed by concatenation of 2 through 2n of first n even numbers).
 * @author Sean A. Irvine
 */
public class A078261 extends A019520 {

  @Override
  public Z next() {
    final Z t = super.next();
    return new Q(t, Z.TEN.pow(Functions.DIGIT_LENGTH.z(t))).num();
  }
}

