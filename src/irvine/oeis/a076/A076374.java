package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072022.
 * @author Sean A. Irvine
 */
public class A076374 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      if (Functions.SIGMA1.z(++m).equals(Functions.PHI.z(m).multiply(mN).add(m))) {
        return Z.valueOf(m);
      }
    }
  }
}
