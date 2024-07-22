package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A066672 Exponent of the largest power of 2 that divides phi(A066669(n)).
 * @author Sean A. Irvine
 */
public class A066672 extends A000010 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().makeOdd();
      if (t.isProbablePrime()) {
        return Z.valueOf(t.auxiliary());
      }
    }
  }
}
