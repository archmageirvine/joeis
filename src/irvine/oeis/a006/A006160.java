package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006160 <code>a(n)=a(a(n-5))+a(n-a(n-5))</code>.
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

