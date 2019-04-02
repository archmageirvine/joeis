package irvine.oeis.a006;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a007.A007629;

/**
 * A006576 Primitive repfigit numbers.
 * @author Sean A. Irvine
 */
public class A006576 extends A007629 {

  // I'm unsure what the exact definition of primitive is here.  It is not simply
  // that any divisor appears previously (otherwise 742 would not be in the sequence).
  // The existing check works for all terms in the sequence at OEIS as of 2017.

  private final HashSet<Z> mPrimitives = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z keith = super.next();
      boolean ok = true;
      for (long k = 2; k < 10; ++k) {
        if (keith.mod(k) == 0 && mPrimitives.contains(keith.divide(k))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        mPrimitives.add(keith);
        return keith;
      }
    }
  }
}
