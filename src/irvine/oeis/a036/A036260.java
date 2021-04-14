package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a007.A007733;

/**
 * A036260 Numbers k &gt; 1 such that k mod ord2(k) is even, where ord2(k) is the order of 2 mod k.
 * @author Sean A. Irvine
 */
public class A036260 extends A007733 {

  @Override
  public Z next() {
    while (true) {
      final Z o = super.next();
      if (mN > 1 && o.isOdd() && Z.valueOf(mN).mod(o).isEven()) {
        return Z.valueOf(mN++);
      }
      ++mN; // skip even
    }
  }
}

