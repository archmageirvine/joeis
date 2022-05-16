package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a007.A007304;

/**
 * A046443 Composite numbers whose 3 prime factors are distinct in length.
 * @author Sean A. Irvine
 */
public class A046443 extends A007304 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z[] p = Jaguar.factor(t).toZArray();
      assert p.length == 3;
      final int l0 = p[0].toString().length();
      final int l1 = p[1].toString().length();
      if (l0 != l1) {
        final int l2 = p[2].toString().length();
        if (l2 != l1) { // l2 != l0 because factors sorted
          return t;
        }
      }
    }
  }
}
