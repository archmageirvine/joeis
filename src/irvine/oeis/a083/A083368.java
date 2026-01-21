package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003754;

/**
 * A083368 a(n) is the position of the highest one in A003754(n).
 * @author Sean A. Irvine
 */
public class A083368 extends A003754 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return Functions.DIGIT_LENGTH.z(2, mA.xor(t));
  }
}
