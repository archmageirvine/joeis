package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A008520 Numbers that contain the letter 'e'.
 * @author Sean A. Irvine
 */
public class A008520 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.toEnglish(++mN).indexOf('e') >= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
