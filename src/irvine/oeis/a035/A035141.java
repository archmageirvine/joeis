package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A035141 Composite numbers k such that digits in k and in juxtaposition of prime factors of k are the same (apart from multiplicity).
 * @author Sean A. Irvine
 */
public class A035141 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final int syn = Functions.SYNDROME.i(c);
      int s = 0;
      for (final Z p : Jaguar.factor(c).toZArray()) {
        s |= Functions.SYNDROME.i(p);
      }
      if (s == syn) {
        return c;
      }
    }
  }
}

