package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083191 Composite numbers arising in A083190.
 * @author Sean A. Irvine
 */
public class A083201 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z x = mA.add(1);
    long k = 1;
    while (true) {
      k *= 2;
      final Z kx = x.multiply(k);
      for (long s = 1; s < 4; s += 2) {
        final Z t = kx.subtract(s);
        if (t.isProbablePrime()) {
          mA = t;
          return t;
        }
      }
    }
  }
}
