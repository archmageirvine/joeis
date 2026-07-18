package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085930 Triangle read by rows in which row n contains n smallest (&gt; 0) numbers which when incremented by n yield a triangular number.
 * @author Sean A. Irvine
 */
public class A085930 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.TRIANGULAR.z(Functions.TRINV.z(mN).add(mM)).subtract(mN);
  }
}
