package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069514 Numbers n such that sigma(reversal(n)) = reversal(sigma(n)). Ignore leading 0's.
 * @author Sean A. Irvine
 */
public class A069514 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.z(Functions.SIGMA.z(++mN)).equals(Functions.SIGMA.z(Functions.REVERSE.z(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
