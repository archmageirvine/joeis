package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A006092 Numbers beginning with letter 't' when spelled out in English.
 * @author Sean A. Irvine
 */
public class A006092 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (English.toEnglish(++mN).startsWith("t")) {
        return Z.valueOf(mN);
      }
    }
  }
}

