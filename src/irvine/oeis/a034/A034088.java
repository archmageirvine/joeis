package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a031.A031178;

/**
 * A034088 Numbers divisible by the sum of the cubes of their digits.
 * @author Sean A. Irvine
 */
public class A034088 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % A031178.digitSumCubes(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

