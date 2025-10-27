package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390009 allocated for Safwan Jaradat.
 * @author Sean A. Irvine
 */
public class A390009 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(++mN) == Functions.DIGIT_SUM.l(Math.abs(mN - Functions.REVERSE.l(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

