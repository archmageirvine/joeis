package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073944 a(n) is the smallest m such that n-th prime divides m! + 1.
 * @author Sean A. Irvine
 */
public class A073944 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z p1 = p.subtract(1);
    Z f = Z.ONE;
    long k = 0;
    while (true) {
      f = f.modMultiply(++k, p);
      if (f.equals(p1)) {
        return Z.valueOf(k);
      }
    }
  }
}

