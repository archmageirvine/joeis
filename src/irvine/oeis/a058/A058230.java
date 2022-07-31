package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A058230 Numbers k such that the product of the lengths of the words in the name of k in American English is equal to k.
 * @author Sean A. Irvine
 */
public class A058230 implements Sequence {

  private int mN = 3;

  private static long lengthsProduct(final String s) {
    long prod = 1;
    for (final String t : s.split(" ")) {
      prod *= t.length();
    }
    return prod;
  }

  @Override
  public Z next() {
    while (true) {
      if (lengthsProduct(English.SINGLETON.toText(++mN).replace(" and ", " ").replace('-', ' ')) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

