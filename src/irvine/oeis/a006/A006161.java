package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A006161 a(n)=a(a(n-1)-1)+a(n+1-a(n-1)).
 * @author Sean A. Irvine
 */
public class A006161 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 3) {
      return Z.TWO;
    }
    return n < 3 ? Z.ONE : a(a(n - 1).intValueExact() - 1).add(a(n + 1 - a(n - 1).intValueExact()));
  }

}

