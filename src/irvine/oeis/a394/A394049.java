package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a120.A120944;
import irvine.oeis.a332.A332785;

/**
 * A394049 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A394049 extends A120944 {

  @Override
  public Z next() {
    final Z t = super.next();
    final Sequence s = new A332785();
    while (true) {
      final Z k = s.next();
      if (t.mod(Functions.RAD.z(k)).isZero()) {
        return k;
      }
    }
  }
}
