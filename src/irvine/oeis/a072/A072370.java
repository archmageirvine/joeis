package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072348.
 * @author Sean A. Irvine
 */
public class A072370 extends Sequence1 {

  private static final CR G = CR.GAMMA.multiply(2);
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).add(1).equals(G.add(CR.valueOf(mN).log()).round())) {
        return Z.valueOf(mN);
      }
    }
  }
}
