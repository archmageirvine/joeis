package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007937 Nonsquares such that some permutation of digits is a square.
 * @author Sean A. Irvine
 */
public class A007937 extends A007936 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (!n.isSquare()) {
        return n;
      }
    }
  }
}
