package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A034292 Fibonacci numbers with exactly 2 different digits (probably finite).
 * @author Sean A. Irvine
 */
public class A034292 extends A000045 {

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (Long.bitCount(ZUtils.syn(f)) == 2) {
        return f;
      }
    }
  }
}

