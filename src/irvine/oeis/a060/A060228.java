package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A060228 Numbers ending in the letter N.
 * @author Sean A. Irvine
 */
public class A060228 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (English.SINGLETON.toText(++mN).endsWith("n")) {
        return Z.valueOf(mN);
      }
    }
  }
}
