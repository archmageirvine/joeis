package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079814 Odd integers k such that phi(k)/k &lt; 6/Pi^2 where phi = A000010.
 * @author Sean A. Irvine
 */
public class A079814 extends Sequence1 {

  private static final CR C = CR.SIX.divide(CR.PI.square());
  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (CR.valueOf(Functions.PHI.l(mN)).compareTo(C.multiply(mN)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

