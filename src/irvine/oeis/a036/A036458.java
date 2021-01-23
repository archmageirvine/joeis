package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036458 For all n, if d recursively applied to a(n) exactly 6 times then the fixed point of d-iteration is just reached.
 * @author Sean A. Irvine
 */
public class A036458 extends A036459 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      if (Z.SIX.equals(s)) {
        return mN;
      }
    }
  }
}

