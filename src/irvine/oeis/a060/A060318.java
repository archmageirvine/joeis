package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060318 Powers of 3 in the odd Catalan numbers Catalan(2^n - 1).
 * @author Sean A. Irvine
 */
public class A060318 extends Sequence1 {

  private int mN = 0;

  private Z pow3(final Z n) {
    return n.subtract(Functions.DIGIT_SUM.l(3, n)).divide2();
  }

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN).subtract(1);
    return pow3(t.multiply2()).subtract(pow3(t.add(1))).subtract(pow3(t));
  }
}
