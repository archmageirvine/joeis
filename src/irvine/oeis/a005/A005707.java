package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005707 a(1) = a(2) = a(3) = a(4) = 1, a(n) = a(a(n-1))+a(n-a(n-1)) for n &gt;= 5.
 * @author Sean A. Irvine
 */
public class A005707 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    return size() <= 4 ? Z.ONE : a(a(size() - 1).intValueExact()).add(a(size() - a(size() - 1).intValueExact()));
  }
}

