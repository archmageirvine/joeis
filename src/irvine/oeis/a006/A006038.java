package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a005.A005101;

/**
 * A006038 Odd primitive abundant numbers.
 * @author Sean A. Irvine
 */
public class A006038 extends A005101 {

  private final ArrayList<Z> mPrimitive = new ArrayList<>();

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      if (!pp.isEven()) {
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
}

