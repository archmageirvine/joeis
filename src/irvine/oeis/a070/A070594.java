package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A070594 Numbers in A070938 that set a new record for digital sums and ending digits.
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

