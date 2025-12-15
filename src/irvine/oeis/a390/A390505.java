package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A390505 a(n) = AN-run sequence of the n-th 01-word, where all 01-words are lexicographically ordered as in A076478; see Comments.
 * @author Sean A. Irvine
 */
public class A390505 extends Sequence1 {

  private final Bumper mBumper = BumperFactory.range(0, 1);
  private int[] mA = {};

  @Override
  public Z next() {
    if (!mBumper.bump(mA)) {
      mA = new int[mA.length + 1];
    }
    final StringBuilder sb = new StringBuilder();
    int c = 1;
    for (int k = 1; k < mA.length; ++k) {
      if (mA[k] != mA[k - 1]) {
        sb.append(Integer.toBinaryString(c)).append(mA[k - 1]);
        c = 1;
      } else {
        ++c;
      }
    }
    sb.append(Integer.toBinaryString(c)).append(mA[mA.length - 1]);
    return new Z(sb);
  }
}
