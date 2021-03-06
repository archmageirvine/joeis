package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030161 Numbers k such that in k and k^3 the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030161 extends A030159 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (A030141.isOk(t)) {
        return t;
      }
    }
  }
}
