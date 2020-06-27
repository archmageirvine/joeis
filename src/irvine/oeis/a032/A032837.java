package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032837 Numbers whose set of base 13 digits is <code>{3,4}</code>.
 * @author Sean A. Irvine
 */
public class A032837 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(13).add(4)
      : get((n - 1) / 2).multiply(13).add(3);
  }
}
