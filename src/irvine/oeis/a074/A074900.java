package irvine.oeis.a074;

import java.util.HashSet;

import irvine.math.z.Z;

/**
 * A074709 Base 4 expansion of 1/n has equal percentage of each digit 0,1,2,3.
 * @author Sean A. Irvine
 */
public class A074900 extends A074709 {

  private final HashSet<Z> mPrimitive = new HashSet<>();

  private boolean is(final Z n) {
    for (final Z u : mPrimitive) {
      if (n.mod(u).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (is(t)) {
        mPrimitive.add(t);
        return t;
      }
    }
  }
}
