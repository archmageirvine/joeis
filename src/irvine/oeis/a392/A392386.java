package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392386 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A392386 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(2 * ++mN) == Functions.OMEGA.i(2 + mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

