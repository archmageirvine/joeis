package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A052090 Palindromic primes whose digits contain circles.
 * @author Sean A. Irvine
 */
public class A052090 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.toString().matches("[0689]*")) {
        return p;
      }
    }
  }
}

