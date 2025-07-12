package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078691.
 * @author Sean A. Irvine
 */
public class A078694 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (CR.TAU.multiply(++mN).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

