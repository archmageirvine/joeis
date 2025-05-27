package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A343977 Numbers k such that k | 11^k + 7^k + 5^k + 3^k + 2^k.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A343977 extends FilterNumberSequence {

  private static final Z Z11 = Z.valueOf(11);

  /** Construct the sequence. */
  public A343977() {
    super(1, 1, k -> {
      final Z kz = Z.valueOf(k);
      return Z.TWO.modPow(k, kz).add(Z.THREE.modPow(k, kz)).add(Z.FIVE.modPow(k, kz)).add(Z.SEVEN.modPow(k, kz)).add(Z11.modPow(k, kz)).mod(k) == 0;
    });
  }
}
