package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078769.
 * @author Sean A. Irvine
 */
public class A078775 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.FACTORIAL.z(++mN).divide(Functions.FACTORIAL.z(Functions.PHI.l(mN))).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

