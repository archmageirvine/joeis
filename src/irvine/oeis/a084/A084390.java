package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.util.string.English;

/**
 * A084390 a(n) is the smallest positive integer &gt; a(n-1) with exactly n letters when spelled in English.
 * @author Sean A. Irvine
 */
public class A084390 extends Sequence3 {

  private int mM = 1;
  private int mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.ONE;
    }
    while (true) {
      if (++mM < 0) {
        throw new UnsupportedOperationException();
      }
      if (English.SINGLETON.toRawText(mM).length() == mN) {
        return Z.valueOf(mM);
      }
    }
  }
}
