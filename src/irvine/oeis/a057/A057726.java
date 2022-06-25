package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057726 Primes of the form 3^(2^n) + 2.
 * @author Sean A. Irvine
 */
public class A057726 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.THREE.pow(1L << ++mN).add(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
