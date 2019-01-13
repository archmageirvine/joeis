package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A008553.
 * @author Sean A. Irvine
 */
public class A008553 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.toEnglish(++mN).indexOf('y') >= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
