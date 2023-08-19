package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a030.A030665;

/**
 * A065145 Smallest prime that begins with the n-th square in decimal notation.
 * @author Sean A. Irvine
 */
public class A065145 extends A030665 {

  private long mN = 0;

  @Override
  public Z next() {
    return solve(Z.valueOf(++mN).square());
  }
}

