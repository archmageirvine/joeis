package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a389.A389336;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A390508 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A390508 extends A390505 {

  // todo currently does not match Kimberling proposal

  private final A389336 mCode = new A389336();
  private final Bumper mBumper = BumperFactory.range(0, 1);
  private int[] mA = {};

  StringBuilder nextNa() {
    if (!mBumper.bump(mA)) {
      mA = new int[mA.length + 1];
    }
    final StringBuilder sb = new StringBuilder();
    int c = 1;
    for (int k = 1; k < mA.length; ++k) {
      if (mA[k] != mA[k - 1]) {
        sb.append(mA[k - 1]).append(Integer.toBinaryString(c));
        c = 1;
      } else {
        ++c;
      }
    }
    sb.append(mA[mA.length - 1]).append(Integer.toBinaryString(c));
    //System.out.println("word: " + sb);
    return sb;
  }

  @Override
  public Z next() {
    return Z.valueOf(mCode.decode(nextNa().toString()));
  }
}
