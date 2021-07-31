package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030153 Numbers n such that in n and n^2 the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030153 extends A030151 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (A030141.isOk(n)) {
        return n;
      }
    }
  }
}
