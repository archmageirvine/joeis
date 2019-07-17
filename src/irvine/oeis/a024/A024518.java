package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A024518 <code>a(n) =</code> position of <code>1 + n^2</code> in <code>A000404</code> (sums of 2 nonzero squares).
 * @author Sean A. Irvine
 */
public class A024518 extends A000404 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).square().add(1);
    while (true) {
      ++mN;
      if (super.next().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}

