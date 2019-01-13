package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A000870.
 * @author Sean A. Irvine
 */
public class A000870 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.toEnglish(++mN).charAt(0) == 's') {
        return Z.valueOf(mN);
      }
    }
  }
}

