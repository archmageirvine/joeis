package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A010060.
 * @author Sean A. Irvine
 */
public class A010060 extends MemorySequence {

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ZERO : get(size() / 2).add(size()).mod(Z.TWO);
  }
}

