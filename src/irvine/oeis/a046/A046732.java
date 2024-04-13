package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a029.A029743;

/**
 * A046732 "Norep emirps": primes with distinct digits which remain prime when reversed.
 * @author Sean A. Irvine
 */
public class A046732 extends A029743 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p == null) {
        return null;
      }
      if (Functions.REVERSE.z(p).isProbablePrime()) {
        return p;
      }
    }
  }
}
