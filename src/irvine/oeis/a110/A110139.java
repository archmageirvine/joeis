package irvine.oeis.a110;
// manually floor at 2021-09-01 16:25

import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A110139 Floor(n/2)^floor(n/2).
 * @author Georg Fischer
 */
public class A110139 extends FloorSequence {

  /** Construct the sequence */
  public A110139() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return Z.valueOf(mN / 2).pow(mN / 2);
  }

}
