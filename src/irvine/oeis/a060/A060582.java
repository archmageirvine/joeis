package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A060582 If the final digit of n in base 3 is the same as a([n/3]) then this digit, otherwise a(n)= mod 3-sum of these two digits, with a(0)=0.
 * @author Sean A. Irvine
 */
public class A060582 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    if (n % 3 == a(n / 3).intValue()) {
      return a(n / 3);
    } else {
      return Z.THREE.subtract(a(n / 3).add(n % 3)).mod(Z.THREE);
    }
  }
}
