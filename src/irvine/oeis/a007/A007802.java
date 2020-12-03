package irvine.oeis.a007;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a165.A165740;

/**
 * A007802 Numbers n such that game of n X n Button Madness need have no solution; this lists only the primitive elements of the set.
 * @author Sean A. Irvine
 */
public class A007802 extends A165740 {

  private final HashSet<Z> mPrimitive = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      boolean ok = true;
      for (final Z m : mPrimitive) {
        if (t.mod(m).isZero()) {
          ok = false;
          break;
        }
      }
      if (ok) {
        mPrimitive.add(t);
        return t;
      }
    }
  }
}
