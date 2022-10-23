package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A000865 Numbers beginning with letter 'o' in English.
 * @author Sean A. Irvine
 */
public class A000865 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (English.SINGLETON.toText(++mN).charAt(0) == 'o') {
        return Z.valueOf(mN);
      }
    }
  }
}

