package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006164 <code>a(n)=a(a(n-1)-4)+a(n+4-a(n-1))</code>.
 * @author Sean A. Irvine
 */
public class A006164 extends MemorySequence {

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
      case 5:
        return Z.FOUR;
      case 6:
        return Z.FIVE;
      default:
        return get(get(n - 1).intValueExact() - 4).add(get(n + 4 - get(n - 1).intValueExact()));
    }
  }
}

