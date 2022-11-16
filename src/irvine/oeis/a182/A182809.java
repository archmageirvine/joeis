package irvine.oeis.a182;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.a134.A134808;

/**
 * A182809 Cyclops-Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A182809 extends A000045 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (A134808.isCyclops(t)) {
        return t;
      }
    }
  }
}

