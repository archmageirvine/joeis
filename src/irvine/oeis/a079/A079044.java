package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079044 Numbers k such that Sum_{j=0..k} sin(j/Pi) &lt; 0.
 * @author Sean A. Irvine
 */
public class A079044 extends Sequence1 {

  private static final CR C = CR.PI.square().multiply(2);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (C.multiply(CR.valueOf(++mN).divide(C).floor().add(1)).compareTo(CR.valueOf(mN + 1)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
