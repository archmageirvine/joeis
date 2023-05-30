package irvine.oeis.a183;
// manually at 2023-05-28 21:45

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A183115 Magnetic Tower of Hanoi, number of moves of disk number k, optimally solving the [RED ; NEUTRAL ; NEUTRAL] or [NEUTRAL ; NEUTRAL ; BLUE] pre-colored puzzle.
 * @author Georg Fischer
 */
public class A183115 extends Sequence0 {

  private int mN = -1;
  private Z mS636 = Z.ZERO;
  private final A183111 mSeq = new A183111();

  @Override
  // P636(n) = P636(n-1) + 2*P909(n-2) + 2*3^(n-3) ; n >= 3; P909 = A183111.
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mS636;
    }
    if (mN == 1) {
      mS636 = Z.ONE;
      return mS636;
    }
    if (mN == 2) {
      mS636 = Z.THREE;
      mSeq.next();
      return mS636;
    }
    mS636 = mS636.add(mSeq.next().multiply2()).add(Z.THREE.pow(mN - 3).multiply2());
    return mS636;
  }
}