package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a318.A318869;
import irvine.oeis.a318.A318870;
import irvine.oeis.memory.MemorySequence;

/**
 * A005142 Number of connected bipartite graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A005142 extends MemorySequence {

  private final Sequence mA1 = new A318870();
  private final Sequence mA2 = new A318870();
  private final Sequence mB = new A318869();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      mB.next();
      mA1.next();
      mA2.next();
      return Z.ONE;
    } else if ((n & 1) == 0) {
      return a(n / 2).add(mB.next()).add(mA1.next()).subtract(mA2.next()).divide2();
    } else {
      return mA1.next().divide2();
    }
  }
}
