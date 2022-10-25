package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A101608 Solution to Tower of Hanoi puzzle encoded in pairs with the moves (1,2),(2,3),(3,1),(2,1),(3,2),(1,3). The disks are moved from peg 1 to 2. For a tower of k disks use the first 2^k-1 number pairs.
 * @author Sean A. Irvine
 */
public class A101608 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  private int f(final int x) {
    // 1 -> 1, 2 -> 3, 3 -> 2
    return (x >>> 1) ^ x;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n & 3) {
      case 0:
        return Z.valueOf(f(get(n / 2).intValue()));
      case 1:
        return Z.valueOf((n >>> 2) % 3 + 1);
      case 2:
        return Z.valueOf(((n >>> 2) + 1) % 3 + 1);
      default: // 3
        return Z.valueOf(f(get(n >> 1).intValue()));
    }
  }
}
