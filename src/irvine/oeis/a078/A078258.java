package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A078258 a(n) = numerator(N), where N = 0.123...n (concatenation of 1 to n after decimal point).
 * @author Sean A. Irvine
 */
public class A078258 extends A007908 {

  @Override
  public Z next() {
    final Z t = super.next();
    return new Q(t, Z.TEN.pow(Functions.DIGIT_LENGTH.z(t))).num();
  }
}

