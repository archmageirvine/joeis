package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A003219 Self numbers divisible by sum of their digits (or, self numbers which are also Harshad numbers).
 * @author Sean A. Irvine
 */
public class A003219 extends A003052 {

  @Override
  public Z next() {
    while (true) {
      final Z self = super.next();
      if (self.mod(Functions.DIGIT_SUM.l(self)) == 0) {
        return self;
      }
    }
  }
}
