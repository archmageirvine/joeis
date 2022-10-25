package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003661 Number of bipartite Steinhaus graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A003661 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      add(null);
      return Z.ONE;
    } else if (n == 2) {
      return Z.TWO;
    } else if (n == 3) {
      return Z.FOUR;
    } else if ((n & 1) == 1) {
      return get(n / 2 + 1).multiply2().add(1);
    } else {
      return get(n / 2).add(get(n / 2 + 1));
    }
  }
}
