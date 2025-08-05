package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079229 Least k&gt;0 such that rad(n+k) &gt; rad(n), where rad is the squarefree kernel (A007947).
 * @author Sean A. Irvine
 */
public class A079229 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long sqfk = Functions.SQUARE_FREE_KERNEL.l(++mN);
    long k = mN;
    while (true) {
      if (Functions.SQUARE_FREE_KERNEL.l(++k) > sqfk) {
        return Z.valueOf(k - mN);
      }
    }
  }
}
