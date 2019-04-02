package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000419 Numbers that are the sum of 3 but no fewer nonzero squares.
 * @author Sean A. Irvine
 */
public class A000419 extends A000378 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z[] s = t.sqrtAndRemainder();
      if (!Z.ZERO.equals(s[1])) {
        boolean ok = true;
        final Z r = s[0];
        for (Z x = Z.ONE; x.compareTo(r) <= 0; x = x.add(1)) {
          if (Z.ZERO.equals(t.subtract(x.square()).sqrtAndRemainder()[1])) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return t;
        }
      }
    }
  }
}
