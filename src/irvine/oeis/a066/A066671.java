package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A066671 Powers of 2 arising in A066669: a(n) is the largest even divisor of EulerPhi(A066669(n)), which by definition is a power of 2.
 * @author Sean A. Irvine
 */
public class A066671 extends A000010 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().makeOdd();
      if (t.isProbablePrime()) {
        return Z.ONE.shiftLeft(t.auxiliary());
      }
    }
  }
}
