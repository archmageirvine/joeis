package irvine.oeis.a130;
// manually hologf4/hologf at 2022-11-10 09:07

import irvine.math.z.Z;
import irvine.oeis.a179.A179710;

/**
 * A130663 1/2048 the number of permutations of 0..n having exactly 7 maxima.
 * @author Georg Fischer
 */
public class A130663 extends A179710 {

  private int mN = -1;

  /** Construct the sequence. */
  public A130663() {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 10) {
      return Z.ZERO;
    }
    return super.next().divide(2048);
  }
}
