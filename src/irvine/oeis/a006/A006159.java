package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A006159 a(n)=a(a(n-4))+a(n-a(n-4)).
 * @author Sean A. Irvine
 */
public class A006159 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < 5 ? Z.ONE : a(a(n - 4).intValueExact()).add(a(n - a(n - 4).intValueExact()));
  }

}

