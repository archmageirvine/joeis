package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A008540 Numbers that contain the letter `f'.
 * @author Sean A. Irvine
 */
public class A008540 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.SINGLETON.toText(++mN).indexOf('f') >= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
