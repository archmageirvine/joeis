package irvine.oeis.a110;
// manually floor at 2021-09-01 16:25

import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A110138 a(n) = ceiling(n/2)^floor(n/2).
 * @author Georg Fischer
 */
public class A110138 extends FloorSequence {

  /** Construct the sequence */
  public A110138() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return Z.valueOf((mN + 1) / 2).pow(mN / 2);
  }

}
