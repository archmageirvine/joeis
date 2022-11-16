package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A005478 Prime Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A005478 extends A000045 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (f.isProbablePrime()) {
        return f;
      }
    }
  }
}
