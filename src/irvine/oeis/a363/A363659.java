package irvine.oeis.a363;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A363659 Numbers k such that the last letter of k is the same as the first letter of k+1 when written in English.
 * @author Sean A. Irvine
 */
public class A363659 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String a = English.SINGLETON.toText(++mN);
      final String b = English.SINGLETON.toText(mN + 1);
      if (b.charAt(0) == a.charAt(a.length() - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
