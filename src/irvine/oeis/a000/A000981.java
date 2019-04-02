package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A000981 Numbers beginning with letter 'n' in English.
 * @author Sean A. Irvine
 */
public class A000981 implements Sequence {

  private int mN = 8;

  @Override
  public Z next() {
    while (true) {
      if (English.toEnglish(++mN).charAt(0) == 'n') {
        return Z.valueOf(mN);
      }
    }
  }
}

