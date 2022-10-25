package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006158 a(n) = a(a(n-3)) + a(n-a(n-3)).
 * @author Sean A. Irvine
 */
public class A006158 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < 4 ? Z.ONE : a(a(n - 3).intValueExact()).add(a(n - a(n - 3).intValueExact()));
  }

}

