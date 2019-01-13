package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A008523.
 * @author Sean A. Irvine
 */
public class A008523 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.toEnglish(++mN).indexOf('t') < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
