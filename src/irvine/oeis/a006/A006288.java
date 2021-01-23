package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006288 Loxton-van der Poorten sequence: base 4 representation contains only -1, 0, +1.
 * @author Sean A. Irvine
 */
public class A006288 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < 2 ? Z.valueOf(n) : get((n + 1) / 3).shiftLeft(2).add((n + 1) % 3 - 1);
  }
}

