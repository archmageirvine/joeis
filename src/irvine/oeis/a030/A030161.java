package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030161 Numbers n such that in n and <code>n^3</code> the parity of digits alternates.
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
