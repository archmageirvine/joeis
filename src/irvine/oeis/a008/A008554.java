package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A008554 Numbers that do not contain the letter `y'.
 * @author Sean A. Irvine
 */
public class A008554 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.SINGLETON.toText(++mN).indexOf('y') < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
