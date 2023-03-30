package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062469 Integer part of log(n^n)^(1/n^n).
 * @author Sean A. Irvine
 */
public class A062469 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final CR nn = CR.valueOf(Z.valueOf(mN).pow(mN));
    System.out.println("nn=" + nn.log() + " " + nn.inverse());
    return nn.log().pow(CR.valueOf(mN).inverse()).floor();
  }
}
