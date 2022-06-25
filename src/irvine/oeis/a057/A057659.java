package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A057659 Prime numbers whose square is composed of just two different decimal digits.
 * @author Sean A. Irvine
 */
public class A057659 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Integer.bitCount(ZUtils.syn(p.square())) == 2) {
        return p;
      }
    }
  }
}
