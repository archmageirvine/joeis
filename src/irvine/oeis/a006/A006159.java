package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006159.
 * @author Sean A. Irvine
 */
public class A006159 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < 5 ? Z.ONE : get(get(n - 4).intValueExact()).add(get(n - get(n - 4).intValueExact()));
  }

}

