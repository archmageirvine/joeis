package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A006092 Numbers beginning with letter 't' when spelled out in English.
 * @author Sean A. Irvine
 */
public class A006092 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (English.SINGLETON.toText(++mN).startsWith("t")) {
        return Z.valueOf(mN);
      }
    }
  }
}

