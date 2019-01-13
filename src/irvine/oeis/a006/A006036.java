package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a005.A005835;

/**
 * A006036.
 * @author Sean A. Irvine
 */
public class A006036 extends A005835 {

  private final ArrayList<Z> mPseudoperfect = new ArrayList<>();

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      boolean ok = true;
      for (final Z n : mPseudoperfect) {
        if (Z.ZERO.equals(pp.mod(n))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        mPseudoperfect.add(pp);
        return pp;
      }
    }
  }
}

