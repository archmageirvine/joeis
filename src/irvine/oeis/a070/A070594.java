package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A070566.
 * @author Sean A. Irvine
 */
public class A070594 extends A070938 {

  private long mMax = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final long ds = Functions.DIGIT_SUM.l(t);
      if (ds > mMax) {
        mMax = ds;
        return t;
      }
    }
  }
}

