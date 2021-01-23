package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A024517 Position of 2*n^2 in A000404 (sums of 2 nonzero squares).
 * @author Sean A. Irvine
 */
public class A024517 extends A000404 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).square().multiply2();
    while (true) {
      ++mN;
      if (super.next().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}

