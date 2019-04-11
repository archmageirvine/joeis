package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A000916 <code>a(2n) = n+2, a(2n-1) =</code> smallest number requiring <code>n+2</code> letters in English.
 * @author Sean A. Irvine
 */
public class A000916 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return Z.valueOf(mN / 2 + 2);
    }
    final int letters = (mN + 1) / 2 + 2;
    int k = 0;
    // this sequence requires "and" at appropriate places in numbers
    while (English.toEnglish(++k).replace("-", "").replace(" ", "").length() != letters) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}

