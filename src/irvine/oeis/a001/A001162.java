package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A001162 Numbers containing an odd number of letters.
 * @author Sean A. Irvine
 */
public class A001162 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if ((English.SINGLETON.toRawText(++mN).length() & 1) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
