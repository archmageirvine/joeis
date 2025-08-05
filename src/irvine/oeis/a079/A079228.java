package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079228 Least number &gt; n with greater squarefree kernel than that of n.
 * @author Sean A. Irvine
 */
public class A079228 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long sqfk = Functions.SQUARE_FREE_KERNEL.l(++mN);
    long k = mN;
    while (true) {
      if (Functions.SQUARE_FREE_KERNEL.l(++k) > sqfk) {
        return Z.valueOf(k);
      }
    }
  }
}
