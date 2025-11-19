package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390641 Numbers k such that the sum of k and 3 times the sum of its prime factors, counted with multiplicity, is prime.
 * @author Sean A. Irvine
 */
public class A390641 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPFR.z(++mN).multiply(3).add(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
