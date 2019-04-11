package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006158 <code>a(n) = a(a(n-3)) + a(n-a(n-3))</code>.
 * @author Sean A. Irvine
 */
public class A006158 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < 4 ? Z.ONE : get(get(n - 3).intValueExact()).add(get(n - get(n - 3).intValueExact()));
  }

}

