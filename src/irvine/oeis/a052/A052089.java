package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052089 Primes formed by concatenating k with k-1.
 * @author Sean A. Irvine
 */
public class A052089 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z t = new Z(String.valueOf(mN + 1) + mN);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

