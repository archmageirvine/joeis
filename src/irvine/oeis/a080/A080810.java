package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080810 a(1) = 7, a(n)= smallest n-th power obtained by inserting digits anywhere in a(n-1).
 * @author Sean A. Irvine
 */
public class A080810 extends Sequence1 {

  private int mN = 0;
  private Z mA = Z.SEVEN;

  @Override
  public Z next() {
    if (++mN > 1) {
      Z k = mA.root(mN);
      while (true) {
        k = k.add(1);
        final Z t = k.pow(mN);
        if (A080486.is(t, mA)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

