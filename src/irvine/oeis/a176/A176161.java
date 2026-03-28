package irvine.oeis.a176;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A176161 Triangle read by rows: T(n,k) = (1 + Eulerian(n+1, k))^n.
 * @author Sean A. Irvine
 */
public class A176161 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.EULERIAN1.z(mN + 1, mM).add(1).pow(mN);
  }
}
