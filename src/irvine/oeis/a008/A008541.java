package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A008541 Numbers that do not contain the letter `f'.
 * @author Sean A. Irvine
 */
public class A008541 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.SINGLETON.toText(++mN).indexOf('f') < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
