package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086470 Numbers k such that psigma(k) = psigma(k+1), where psigma(k) = A086469(k).
 * @author Sean A. Irvine
 */
public class A086470 extends Sequence1 {

  private final A086469 mS = new A086469();
  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      if (mS.a(++mN).equals(mS.a(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}

