package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005707.
 * @author Sean A. Irvine
 */
public class A005707 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    return size() <= 4 ? Z.ONE : get(get(size() - 1).intValueExact()).add(get(size() - get(size() - 1).intValueExact()));
  }
}

