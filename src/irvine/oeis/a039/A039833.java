package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A039833.
 * @author Sean A. Irvine
 */
public class A039833 extends A039832 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Z.FOUR.equals(Cheetah.factor(t.add(2)).sigma0())) {
        return t;
      }
    }
  }
}
