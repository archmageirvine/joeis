package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006160.
 * @author Sean A. Irvine
 */
public class A006160 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < 6 ? Z.ONE : get(get(n - 5).intValueExact()).add(get(n - get(n - 5).intValueExact()));
  }

}

