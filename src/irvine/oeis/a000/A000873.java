package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A000873 Numbers beginning with letter 'e' in English.
 * @author Sean A. Irvine
 */
public class A000873 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.toEnglish(++mN).charAt(0) == 'e') {
        return Z.valueOf(mN);
      }
    }
  }
}

