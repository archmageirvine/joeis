package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078400 Iterated sum-of-digits of A078403(n).
 * @author Sean A. Irvine
 */
public class A078400 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(Z.NINE).isProbablePrime()) {
        return Functions.DIGIT_SUM_ROOT.z(p);
      }
    }
  }
}

