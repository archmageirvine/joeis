package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052490 Numbers n with only one nonzero solution to "numbers that are n times sum of their digits".
 * @author Sean A. Irvine
 */
public class A052490 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z nbd = Z.ONE;
      while (nbd.multiply(9 * mN).compareTo(Z.TWO.pow(nbd)) > 0) {
        nbd = nbd.add(1);
      }
      boolean seen = false;
      for (Z k = nbd.multiply(9 * mN); k.signum() > 0; k = k.subtract(1)) {
        if (Z.valueOf(Functions.DIGIT_SUM.l(k)).multiply(mN).equals(k)) {
          if (seen) {
            seen = false; // More than 1 solution for mN
            break;
          }
          seen = true;
        }
      }
      if (seen) {
        return Z.valueOf(mN);
      }
    }
  }
}

