package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065976 Consecutive terms of A065966 which are also consecutive integers.
 * @author Sean A. Irvine
 */
public class A065976 extends A065966 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(1).equals(mA)) {
        return t;
      }
    }
  }
}
