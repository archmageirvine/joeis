package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046086 Smallest member 'a' of the primitive Pythagorean triples (a,b,c) ordered by increasing c, then b.
 * @author Sean A. Irvine
 */
public class A046086 extends Sequence1 {

  private long mC = 4;
  private long mB = 4;

  @Override
  public Z next() {
    while (true) {
      if (++mB >= mC) {
        ++mC;
        mB = 1;
      }
      if (Functions.GCD.l(mC, mB) == 1) {
        final long a2 = mC * mC - mB * mB;
        final long s = Functions.SQRT.l(a2);
        if (s < mB && s * s == a2 && Functions.GCD.l(s, mC) == 1 && Functions.GCD.l(s, mB) == 1) {
          return Z.valueOf(s);
        }
      }
    }
  }
}
