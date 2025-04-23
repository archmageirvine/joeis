package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076925 a(n) = A076924(n) divided by the n-th prime.
 * @author Sean A. Irvine
 */
public class A076925 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final int syn = Functions.SYNDROME.i(p);
    if ((syn & 0b1111111110) == 0b1111111110) {
      return Z.ZERO; // p already contains every digit except possibly 0
    }
    Z k = p;
    while (true) {
      k = k.add(p);
      if ((Functions.SYNDROME.i(k) & syn) == 0) {
        return k.divide(p);
      }
    }
  }
}

