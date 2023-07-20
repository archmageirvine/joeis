package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A078474 a(1)=a(2)=a(3)=1, a(n)=n-a(a(n-1))-a(a(n-2))-a(a(n-3)).
 * @author Sean A. Irvine
 */
public class A078474 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return Z.ONE;
    }
    return Z.valueOf(n).subtract(a(a(n - 1).intValueExact())).subtract(a(a(n - 2).intValueExact())).subtract(a(a(n - 3).intValueExact()));
  }
}
