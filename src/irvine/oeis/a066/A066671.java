package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A066671 a(n) is the largest power of 2 that divides phi(A066669(n)).
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
