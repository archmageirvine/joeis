package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A052290 Prime values of n!*2^n+n+1 = A000165(n)+n+1.
 * @author Sean A. Irvine
 */
public class A052290 extends A000142 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().shiftLeft((int) mN).add(mN + 1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
