package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A066672 Exponents of powers of 2 displayed in A066671: 2^a[n] is the largest even divisor of A066669(n).
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
