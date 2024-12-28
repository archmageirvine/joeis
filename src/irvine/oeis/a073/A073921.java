package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073921 Odd numbers which retain their position in the rearrangement of A073920: terms of A073920 for which a(n) = 2n-1.
 * @author Sean A. Irvine
 */
public class A073921 extends A073920 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (super.next().longValueExact() == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

