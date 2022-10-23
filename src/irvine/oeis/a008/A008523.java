package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A008523 Numbers that do not contain the letter 't'.
 * @author Sean A. Irvine
 */
public class A008523 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.SINGLETON.toText(++mN).indexOf('t') < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
