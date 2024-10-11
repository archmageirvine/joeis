package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A062086 Squarefree numbers with all odd digits.
 * @author Sean A. Irvine
 */
public class A062086 extends A005117 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((Functions.SYNDROME.i(t) & 0b0101010101) == 0) {
        return t;
      }
    }
  }
}
