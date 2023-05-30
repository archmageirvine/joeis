package irvine.oeis.a183;
// manually at 2023-05-28 21:45

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A183116 Magnetic Tower of Hanoi, total number of moves, optimally solving the [RED ; NEUTRAL ; NEUTRAL] or [NEUTRAL ; NEUTRAL ; BLUE] pre-colored puzzle.
 * @author Georg Fischer
 */
public class A183116 extends Sequence0 {

  private int mN = -1;
  private Z mS636 = Z.ZERO;
  private final A183112 mSeq = new A183112();

  @Override
  // S636(n) = S636(n-1) + 2*S909(n-2) + 3^(n-2) + 2 ; n >= 2 ; S909(0)  = 0; S909 = A183112.
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mS636;
    }
    if (mN == 1) {
      mS636 = Z.ONE;
      return mS636;
    }
    mS636 = mS636.add(mSeq.next().multiply2()).add(Z.THREE.pow(mN - 2)).add(2);
    return mS636;
  }
}
