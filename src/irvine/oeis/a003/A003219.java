package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A003219 Self numbers divisible by sum of their digits <code>(or</code>, self numbers which are also Harshad numbers).
 * @author Sean A. Irvine
 */
public class A003219 extends A003052 {

  @Override
  public Z next() {
    while (true) {
      final Z self = super.next();
      if (self.mod(ZUtils.digitSum(self)) == 0) {
        return self;
      }
    }
  }
}
