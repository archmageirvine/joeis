package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a002.A002313;

/**
 * A047818 a(n) is the least number m such that A002313(n)*m - 1 is a square.
 * @author Sean A. Irvine
 */
public class A047818 extends A002313 {

  @Override
  public Z next() {
    final Z t = super.next();
    long m = 0;
    while (!t.multiply(++m).subtract(1).isSquare()) {
      // do nothing
    }
    return Z.valueOf(m);
  }
}
