package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A006160 a(n)=a(a(n-5))+a(n-a(n-5)).
 * @author Sean A. Irvine
 */
public class A006160 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < 6 ? Z.ONE : a(a(n - 5).intValueExact()).add(a(n - a(n - 5).intValueExact()));
  }

}

