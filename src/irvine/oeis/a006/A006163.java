package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006163.
 * @author Sean A. Irvine
 */
public class A006163 extends MemorySequence {

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
      default:
        return get(get(n - 1).intValueExact() - 3).add(get(n + 3 - get(n - 1).intValueExact()));
    }
  }
}

