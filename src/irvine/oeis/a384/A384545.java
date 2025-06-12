package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A384545 allocated for Ken Clements.
 * @author Sean A. Irvine
 */
public class A384545 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z phash = Functions.PRIMORIAL.z(p);
    long m = 0;
    while (true) {
      if (Functions.GPF.z(++m).compareTo(p) <= 0) {
        final Z t = phash.multiply(m);
        if (t.subtract(1).isProbablePrime() && t.add(1).isProbablePrime()) {
          return Z.valueOf(m);
        }
      }
    }
  }
}
