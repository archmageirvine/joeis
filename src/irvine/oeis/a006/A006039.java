package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a023.A023196;

/**
 * A006039 Primitive non-deficient numbers.
 * @author Sean A. Irvine
 */
public class A006039 extends A023196 {

  private final ArrayList<Z> mPrimitive = new ArrayList<>();

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      boolean ok = true;
      for (final Z n : mPrimitive) {
        if (Z.ZERO.equals(pp.mod(n))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        mPrimitive.add(pp);
        return pp;
      }
    }
  }
}

