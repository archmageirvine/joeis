package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059792 Numbers k such that floor(Pi^k) is prime.
 * @author Sean A. Irvine
 */
public class A059792 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (CR.PI.pow(++mN).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
