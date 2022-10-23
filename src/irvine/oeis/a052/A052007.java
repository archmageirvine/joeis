package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052007 Numbers m such that 2^m + m is prime.
 * @author Sean A. Irvine
 */
public class A052007 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Z.ONE.shiftLeft(mN).add(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
