package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A006163 a(n)=a(a(n-1)-3)+a(n+3-a(n-1)).
 * @author Sean A. Irvine
 */
public class A006163 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
      case 1:
      case 2:
        return Z.ONE;
      case 3:
        return Z.TWO;
      case 4:
        return Z.THREE;
      case 5:
        return Z.FOUR;
      default:
        return a(a(n - 1).intValueExact() - 3).add(a(n + 3 - a(n - 1).intValueExact()));
    }
  }
}

