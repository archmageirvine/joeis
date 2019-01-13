package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007731.
 * @author Sean A. Irvine
 */
public class A007731 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 0 ? Z.ONE : get(n / 2).add(get(n / 3)).add(get(n / 6));
  }
}
