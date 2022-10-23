package irvine.oeis.a330;
// manually 2021-06-13

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A330581 a(0) = 2; thereafter a(n) = a(n - 1)^n + 1.
 * @author Georg Fischer
 */
public class A330581 extends Sequence0 {

  private Z mAn;
  private int mN;

  /** Construct the sequence. */
  public A330581() {
    mAn = Z.TWO;
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mAn;
    mAn = mAn.pow(mN).add(Z.ONE);
    return result;
  }
}
