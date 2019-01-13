package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050292.
 * @author Sean A. Irvine
 */
public class A050292 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ZERO;
    }
    return Z.valueOf(size()).subtract(get(size() / 2));
  }
}
