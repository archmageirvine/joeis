package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A059093 Numbers ending with the letter "e" (in English).
 * @author Sean A. Irvine
 */
public class A059093 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (English.SINGLETON.toText(++mN).endsWith("e")) {
        return Z.valueOf(mN);
      }
    }
  }
}
