package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001481;

/**
 * A046711 From the Bruck-Ryser theorem: numbers n == 1 or 2 (mod 4) which are also the sum of 2 squares.
 * @author Sean A. Irvine
 */
public class A046711 extends A001481 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final long r = a.mod(4);
      if (r == 1 || r == 2) {
        return a;
      }
    }
  }
}
