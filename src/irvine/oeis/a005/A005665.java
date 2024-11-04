package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005665 Minimal number of moves for the cyclic variant of the Towers of Hanoi for 3 pegs and n disks, with the final peg one step away.
 * @author Sean A. Irvine
 */
public class A005665 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = mA.add(mB).multiply2().add(3);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

