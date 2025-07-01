package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a019.A019519;

/**
 * A078259 a(n) = denominator(N), where N = 0.135..(2n-1) is the concatenation of the first n odd numbers after decimal point.
 * @author Sean A. Irvine
 */
public class A078259 extends A019519 {

  @Override
  public Z next() {
    final Z t = super.next();
    return new Q(t, Z.TEN.pow(Functions.DIGIT_LENGTH.z(t))).den();
  }
}

