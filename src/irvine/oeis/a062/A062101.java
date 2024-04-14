package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A062101 Squarefree numbers with every digit a squarefree number.
 * @author Sean A. Irvine
 */
public class A062101 extends A005117 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((Functions.SYNDROME.i(t) & 0b1100010001) == 0) {
        return t;
      }
    }
  }
}
