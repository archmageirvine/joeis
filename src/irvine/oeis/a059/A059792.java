package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059792 Numbers n such that floor(Pi^n) is prime.
 * @author Sean A. Irvine
 */
public class A059792 implements Sequence {

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
