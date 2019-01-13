package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002987.
 * @author Sean A. Irvine
 */
public class A002987 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n);
    }
    // Brute force Chinese Remainder Theorem
    Z k = Z.ONE; // Solution must be congruent to 1 (mod n-1)
    while (true) {
      boolean ok = true;
      for (int j = size() - 1; j >= 1; --j) {
        if (k.mod(j) != get(n - j).mod(j)) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return k;
      }
      k = k.add(n - 1);
    }
  }
}
