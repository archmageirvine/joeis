package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007937.
 * @author Sean A. Irvine
 */
public class A007937 extends A007936 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (!Z.ZERO.equals(n.sqrtAndRemainder()[1])) {
        return n;
      }
    }
  }
}
