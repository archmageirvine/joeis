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
      if (!s[1].isZero()) {
        boolean ok = true;
        final Z r = s[0];
        for (Z x = Z.ONE; x.compareTo(r) <= 0; x = x.add(1)) {
          if (t.subtract(x.square()).isSquare()) {
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
