package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067729 Numbers k such that floor(log(3)^k) is prime.
 * @author Sean A. Irvine
 */
public class A067729 extends Sequence1 {

  private static final CR LOG3 = CR.THREE.log();
  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (LOG3.pow(++mN).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
