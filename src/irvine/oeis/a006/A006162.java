package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006162 a(n)=a(a(n-1)-2)+a(n+2-a(n-1)).
 * @author Sean A. Irvine
 */
public class A006162 extends MemorySequence {

  {
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
      default:
        return get(get(n - 1).intValueExact() - 2).add(get(n + 2 - get(n - 1).intValueExact()));
    }
  }
}

