package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A046444 Composite numbers whose 4 prime factors are distinct in length.
 * @author Sean A. Irvine
 */
public class A046444 extends A046386 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z[] p = Cheetah.factor(t).toZArray();
      assert p.length == 4;
      final int l0 = p[0].toString().length();
      final int l1 = p[1].toString().length();
      if (l0 != l1) {
        final int l2 = p[2].toString().length();
        if (l2 != l1) {
          final int l3 = p[3].toString().length();
          if (l3 != l2) { // l2 != l0 && l2 != l1 because factors sorted
            return t;
          }
        }
      }
    }
  }
}
