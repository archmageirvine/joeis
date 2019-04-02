package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A014388 a(2n-1) = n+2, a(2n) = smallest number requiring n+2 letters in English.
 * @author Sean A. Irvine
 */
public class A014388 implements Sequence {

  private int mN = 4;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      return Z.valueOf((mN + 1) / 2);
    } else {
      int k = 0;
      while (English.toEnglish(++k).replaceAll("[- ]", "").length() != mN / 2) {
        // do nothing
      }
      return Z.valueOf(k);
    }
  }
}

